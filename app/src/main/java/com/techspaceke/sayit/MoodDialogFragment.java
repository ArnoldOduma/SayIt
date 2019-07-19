package com.techspaceke.sayit;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.DialogFragment;

import butterknife.BindView;

public class MoodDialogFragment extends DialogFragment {
    @BindView(R.id.cancelButton) Button cancelButton;
    @BindView(R.id.buttonAlert) Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState){
        View rootView = inflater.inflate(R.layout.activity_alertdialog, container, false);
        Button cancelButton = rootView.findViewById(R.id.cancelButton);
        Button submitButton = rootView.findViewById(R.id.buttonAlert);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        getDialog().setTitle("SayIt Check");

        RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup);
        int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
        final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Testing","-----------------------\n" + selectedRadioButton.getText().toString());
                dismiss();
            }
        });



        return rootView;

    }

//    @Override
//    public Dialog onCreateDialog(Bundle savedInstancesState){
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Dialog via Builder");
//        builder.setMessage("Would you like to take a survey?");
//
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int which) {
//                dismiss();
//            }
//        });
//
//        builder.setNegativeButton("Nope", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dismiss();
//            }
//        });
//        return builder.create();
//    }
//    @Override
//    public boolean

}
