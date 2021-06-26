package oleksandr.kotyuk.orthodoxcalendarfree.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import oleksandr.kotyuk.orthodoxcalendarfree.R;

public class LastReadPsalturDialogFragment extends DialogFragment {
			/*public View onCreateView(LayoutInflater inflater, ViewGroup container,
				      Bundle savedInstanceState) {
				    getDialog().setTitle(R.string.title_update_news);

				    View v = inflater.inflate(R.layout.dialog_update_news, null);
				    return v;
				  }*/

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // Set Dialog Icon
                //.setIcon(R.drawable.androidhappy)
                // Set Dialog Title
                .setTitle(R.string.psaltur_dialog1)
                // Set Dialog Message
                .setMessage(R.string.psaltur_dialog3)

                // Negative Button
                /*.setNegativeButton(R.string.button_dialog_update1, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,	int which) {
                        //Toast.makeText(getActivity(), "Еще...", Toast.LENGTH_LONG).show();
                        UpdateNewsDialogFragmentList undf_list = new UpdateNewsDialogFragmentList();
                        undf_list.show(getFragmentManager(), "dialog_update_news_list");
                    }
                })*/
                // Positive button
                .setPositiveButton(R.string.button_dialog_update2, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getActivity(), "YES", Toast.LENGTH_LONG).show();

                    }
                }).create();


    }
}
