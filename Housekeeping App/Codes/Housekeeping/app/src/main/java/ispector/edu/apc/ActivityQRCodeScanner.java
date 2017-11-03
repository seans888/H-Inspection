package ispector.edu.apc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.zxing.Result;
import ispector.edu.apc.global.HousekeepingApp;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * Created by ispector on 10/17/2017.
 */

    public class ActivityQRCodeScanner extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;

    private String TAG = ActivityQRCodeScanner.class.getSimpleName();
    @Override
    public void onCreate(Bundle state) {
            super.onCreate(state);
            mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
            setContentView(mScannerView);                // Set the scanner view as the content view
            }

    @Override
    public void onResume() {
            super.onResume();
            mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
            mScannerView.startCamera();          // Start camera on resume
            }

    @Override
    public void onPause() {
            super.onPause();
            mScannerView.stopCamera();           // Stop camera on pause
            }

    @Override
    public void handleResult(Result rawResult) {
            // Do something with the result here
            Log.v(TAG, rawResult.getText()); // Prints scan results
            Log.v(TAG, rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode, pdf417 etc.)
            HousekeepingApp.setQRCode(rawResult.getText());
            // If you would like to resume scanning, call this method below:
            mScannerView.resumeCameraPreview(this);
            this.finish();
    }
}