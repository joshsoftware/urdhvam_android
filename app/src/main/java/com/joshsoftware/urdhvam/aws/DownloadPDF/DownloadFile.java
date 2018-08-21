package com.joshsoftware.urdhvam.aws.DownloadPDF;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;

import com.joshsoftware.urdhvam.R;

import java.io.File;
import java.util.Calendar;

public class DownloadFile extends AsyncTask<String, Void, File> {

    private ProgressDialog mProgressDialog;
    private Context mContext;
    private IpdfDownloadListener mIpdfDownloadListener;

    public DownloadFile(Context context,IpdfDownloadListener ipdfDownloadListener) {
        this.mContext = context;
        this.mIpdfDownloadListener =ipdfDownloadListener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialog = new ProgressDialog(mContext);
        mProgressDialog.setMessage("Downloading, Please Wait!");
        mProgressDialog.setIndeterminate(false);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.show();
    }

    @Override
    protected File doInBackground(String... strings) {
        String fileUrl = strings[0];
        fileUrl = fileUrl.replaceAll(" ","%20");
        File root = Environment.getExternalStorageDirectory();
        File f = new File(root.getAbsolutePath() + "/" + mContext.getString(R.string.app_name));
        if (!f.exists()) {
            f.mkdirs();
        }
        String fileType = fileUrl.substring(fileUrl.length() - 3);
        String imgFileName = Calendar.getInstance().getTimeInMillis() + "." + fileType;
        File file = new File(f,imgFileName);
        FileDownloader.downloadFile(fileUrl, file);

        return file;

    }

    @Override
    protected void onPostExecute(File file) {
        super.onPostExecute(file);
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }

        if(file != null){
            mIpdfDownloadListener.onPdfDownloadSuccess(file);
        }
    }

    public interface IpdfDownloadListener{
        void onPdfDownloadSuccess(File file);
    }
}

