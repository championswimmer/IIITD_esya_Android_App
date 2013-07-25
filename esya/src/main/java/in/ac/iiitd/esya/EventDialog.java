package in.ac.iiitd.esya;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;

/**
 * Created by championswimmer on 25/7/13.
 */
public class EventDialog extends DialogFragment {
    public int mLayoutId;

    public EventDialog (int layoutId) {
        mLayoutId = layoutId;
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(mLayoutId, null))
        ;
        // Create the AlertDialog object and return it
        return builder.create();
    }
}