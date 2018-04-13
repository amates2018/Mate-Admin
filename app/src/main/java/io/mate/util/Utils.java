package io.mate.util;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder;

import io.mate.data.Bus;
import io.mate.data.Driver;
import io.mate.data.Terminal;
import io.mate.data.Trip;

/**
 * Project : mate-admin
 * Created by Dennis Bilson on Fri at 12:25 AM.
 * Package name : io.mate.util
 */
public class Utils {
	public static final String DRIVER_REF = "user";
	public static final String STORAGE_REF = "bucket";
	public static final String TERMINAL_REF = "terminal";
	public static final String BUS_REF = "bus";
	public static final String TRIP_REF = "trip";
	
	//Upload data of any type
	public static void uploadData(Object data) {
		if (data instanceof Bus) {
			busUpload((Bus) data);
		} else if (data instanceof Terminal) {
			terminalUpload((Terminal) data);
		} else if (data instanceof Driver) {
			driverUpload((Driver) data);
		} else {
			tripUpload((Trip) data);
		}
	}
	
	private static void tripUpload(Trip data) {
		//todo
	}
	
	private static void driverUpload(Driver data) {
		//todo
	}
	
	private static void busUpload(Bus data) {
		//todo
	}
	
	private static void terminalUpload(Terminal data) {
		//todo
	}

	//Get place
	public static void getPlace(Activity host, int code) {
		try {
			Intent build = new IntentBuilder()
					.build(host);
			host.startActivityForResult(build, code);
			
		} catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
			Toast.makeText(host, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
		}
	}
	
}
