package co.ke.bsl.task.async;

import android.app.ProgressDialog;
import android.content.Context;

import co.ke.bsl.R;

//reviewed
public class AsyncActivitySupport {
	private Context context;
	private ProgressDialog progressDialog;

	public AsyncActivitySupport(Context context) {
		this.context = context;
	}

	public void showLoadingProgressDialog() {
		progressDialog = ProgressDialog.show(this.context,
				this.context.getString(R.string.loadingProgressDialog_title),
				this.context.getString(R.string.loadingProgressDialog_text),
				true);
	}

	public void dismissProgressDialog() {
		if (this.progressDialog != null) {
			progressDialog.dismiss();
		}
	}
}
