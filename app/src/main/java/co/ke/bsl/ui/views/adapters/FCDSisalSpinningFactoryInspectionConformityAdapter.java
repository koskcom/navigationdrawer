package co.ke.bsl.ui.views.adapters;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

import co.ke.bsl.R;
import co.ke.bsl.ui.views.fragments.FCDSisalFactoryInspectionConformityAssessmentStep1;
import co.ke.bsl.ui.views.fragments.FCDSisalFactoryInspectionConformityAssessmentStep2;
import co.ke.bsl.ui.views.fragments.FCDSisalFactoryInspectionConformityAssessmentStep3;
import co.ke.bsl.ui.views.fragments.FCDSisalSpinningFactoryInspectionConformityAssessmentStep1;
import co.ke.bsl.ui.views.fragments.FCDSisalSpinningFactoryInspectionConformityAssessmentStep2;
import co.ke.bsl.ui.views.fragments.FCDSisalSpinningFactoryInspectionConformityAssessmentStep3;

public class FCDSisalSpinningFactoryInspectionConformityAdapter extends AbstractFragmentStepAdapter {

    private static final String CURRENT_STEP_POSITION_KEY = "";

    public FCDSisalSpinningFactoryInspectionConformityAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        if (position == 0) {
            final FCDSisalSpinningFactoryInspectionConformityAssessmentStep1 step = new FCDSisalSpinningFactoryInspectionConformityAssessmentStep1();
            Bundle b = new Bundle();
            b.putInt(CURRENT_STEP_POSITION_KEY, position);
            step.setArguments(b);
            return step;
        } else if (position == 1) {
            final FCDSisalSpinningFactoryInspectionConformityAssessmentStep2 step = new FCDSisalSpinningFactoryInspectionConformityAssessmentStep2();
            Bundle b = new Bundle();
            b.putInt(CURRENT_STEP_POSITION_KEY, position);
            step.setArguments(b);
            return step;
        } else if (position == 2) {
            final FCDSisalSpinningFactoryInspectionConformityAssessmentStep3 step = new FCDSisalSpinningFactoryInspectionConformityAssessmentStep3();
            Bundle b = new Bundle();
            b.putInt(CURRENT_STEP_POSITION_KEY, position);
            step.setArguments(b);
            return step;
        }

        final FCDSisalSpinningFactoryInspectionConformityAssessmentStep1 step = new FCDSisalSpinningFactoryInspectionConformityAssessmentStep1();
        Bundle b = new Bundle();
        b.putInt(CURRENT_STEP_POSITION_KEY, position);
        step.setArguments(b);
        return step;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        if (position == 0) {
            return new StepViewModel.Builder(context)
                    .setTitle(R.string.sisal_spining_factory)
                    .setEndButtonLabel(R.string.proceed)
                    .create();
        } else if (position == 1) {
            return new StepViewModel.Builder(context)
                    .setTitle(R.string.sisal_spining_factory)
                    .setEndButtonLabel(R.string.proceed)
                    .setBackButtonLabel(R.string.back)
                    .create();
        } else if (position == 2) {
            return new StepViewModel.Builder(context)
                    .setTitle(R.string.sisal_spining_factory)
                    .setEndButtonLabel(R.string.save)
                    .setBackButtonLabel(R.string.back)
                    .create();
        }
        return new StepViewModel.Builder(context)
                .setTitle(R.string.sisal_spining_factory)
                .setEndButtonLabel(R.string.proceed)
                .create();
    }
}