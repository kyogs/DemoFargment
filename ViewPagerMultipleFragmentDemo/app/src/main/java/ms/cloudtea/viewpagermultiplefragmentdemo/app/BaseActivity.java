package ms.cloudtea.viewpagermultiplefragmentdemo.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ms.cloudtea.viewpagermultiplefragmentdemo.app.view.TextView;


/**
 * Created by chirag.sudani on 23/05/16.
 */
public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    private TextView txtTitle, txtBack, txtRightMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void initToobar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        txtTitle = (TextView) findViewById(R.id.txt_title);
        txtBack = (TextView) findViewById(R.id.txt_back);
        txtBack.setOnClickListener(this);
        txtRightMenu = (TextView) findViewById(R.id.txt_right_menu);
        txtRightMenu.setOnClickListener(this);
        setSupportActionBar(toolbar);
//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction("com.package.ACTION_FINISH");
//        receiver = new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                finish();
//            }
//        };
//        registerReceiver(receiver, intentFilter);
    }

    @Override
    public void onClick(View v) {
        Utils.hideSoftKeyboard(this);
        switch (v.getId()) {
            case R.id.txt_right_menu:
                break;
            case R.id.txt_back:
                onBack();
                break;
        }
    }

    private void onBack() {
    }

    @Override
    protected void onDestroy() {
//        try {
//            if (receiver != null)
//                unregisterReceiver(receiver);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        super.onDestroy();
    }


//    private void showAlertExkitApp() {
//        final Dialog dialog = new Dialog(this);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setContentView(R.layout.error_dialog);
//        TextView txtTitle = (TextView) dialog.findViewById(R.id.dialog_txt_title);
//        txtTitle.setText("Exit Confirmation");
//        TextView txtMesg = (TextView) dialog.findViewById(R.id.dialog_txt_online);
//        txtMesg.setText("Are you sure you want to Exit?");
//        TextView txt_cancel = (TextView) dialog.findViewById(R.id.txt_cancel);
//        txt_cancel.setVisibility(View.VISIBLE);
//        txt_cancel.setText("No");
//        txt_cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//            }
//        });
//        TextView txt_done = (TextView) dialog.findViewById(R.id.txt_done);
//        txt_done.setText("Yes");
//        txt_done.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//                finish();
//            }
//        });
//        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
//            @Override
//            public void onCancel(DialogInterface dialog) {
//                dialog.dismiss();
//            }
//        });
//        dialog.show();
//    }

}
