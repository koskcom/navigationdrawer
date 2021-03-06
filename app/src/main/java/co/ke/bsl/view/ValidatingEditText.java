package co.ke.bsl.view;

import android.content.Context;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import co.ke.bsl.view.validation.ViewValidator;
import co.ke.bsl.view.validation.textview.EmailValidator;
import co.ke.bsl.view.validation.textview.PhoneNumberValidator;
import co.ke.bsl.view.validation.textview.ZipCodeValidator;

// reviewed
public class ValidatingEditText extends EditText implements ValidatingView {
	private ViewValidator validator;
	private String fieldDisplayNameForErrorMsg;

	public ValidatingEditText(Context context) {
		super(context);
	}

	public ValidatingEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public ValidatingEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void setValidator(ViewValidator validator,
			String fieldDisplayNameForErrorMsg) {
		this.validator = validator;
		this.fieldDisplayNameForErrorMsg = fieldDisplayNameForErrorMsg;

		initInputType(validator);
		registerListeners();
	}

	@Override
	public void flagOrUnflagValidationError() {
		String msg = this.isValid() ? null : this.validator
				.getErrorMessage(this.fieldDisplayNameForErrorMsg);
		this.setError(msg);
	}

	@Override
	public boolean isValid() {
		return validator.validate(this);
	}

	@Override
	public void unflagValidationError() {
		setError(null);
	}

	protected void initInputType(ViewValidator validator) {
		if (validator instanceof EmailValidator) {
			setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
		} else if (validator instanceof PhoneNumberValidator) {
			setInputType(InputType.TYPE_CLASS_PHONE);
		} else if (validator instanceof ZipCodeValidator) {
			setInputType(InputType.TYPE_CLASS_NUMBER);
		} else if (!isPassword()) {
			setInputType(InputType.TYPE_CLASS_TEXT);
		} else if (isPassword()) {
			setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
		}
		setInputType(getInputType() | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
	}
	
	protected boolean isPassword() {
		TransformationMethod method = getTransformationMethod();
		return method != null && method instanceof PasswordTransformationMethod;
	}

	protected void registerListeners() {
		registerOnFocusChangeListener();
		registerOnKeyListener();
		registerOnLongClickListener();
	}

	protected void registerOnLongClickListener() {
		setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				ValidatingEditText.this.flagOrUnflagValidationError();
				return true;
			}
		});
	}

	protected void registerOnKeyListener() {
		setOnKeyListener(new OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				final int KEYCODE_ENTER = 66;

				boolean consumed = false;

				if (keyCode == KEYCODE_ENTER
						&& event.getAction() == KeyEvent.ACTION_DOWN) {
					ValidatingEditText.this.flagOrUnflagValidationError();
					consumed = true;
				}

				return consumed;
			}
		});
	}

	protected void registerOnFocusChangeListener() {
		setOnFocusChangeListener(new OnFocusChangeListener() {
			@Override
			public void onFocusChange(View view, boolean hasFocus) {
				if (!hasFocus) {
					ValidatingEditText.this.flagOrUnflagValidationError();
				}
			}
		});
	}
}
