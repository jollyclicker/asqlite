package dk.andsen.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

/**
 * Part of a41cv
 * @author andsen
 *
 */
public class Utils {

	private static String app = "a41";
	/**
	 * Write a debug message to the log
	 * @param msg Message
	 */
	public static void logD(String msg) {
		Log.d(app, msg);
	}
	
	/**
	 * Write an error message to the log
	 * @param msg Message
	 */
	public static void logE(String msg) {
		Log.e(app, msg);
	}
	
	/**
	 * Show a dialog with an error message
	 * @param e the message
	 * @param cont the programmes content
	 */
	public static void showException(String e, Context cont) {
		AlertDialog alertDialog = new AlertDialog.Builder(cont).create();
		alertDialog.setTitle("Error");
		alertDialog.setMessage(e);
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				return;
			}
		});
		alertDialog.show();
	}

}
