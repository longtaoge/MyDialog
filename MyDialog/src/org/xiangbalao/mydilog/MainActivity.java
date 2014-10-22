package org.xiangbalao.mydilog;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        
        openDialog("内容");
        
       
        
    }


 
    
    
    
    
    
    private void openDialog(String contents) {

		TextView dialog_title, send_text, cancel_text;

		EditText mobile_edit, wx_edit, message_edit;

		View menuView = View.inflate(this, R.layout.layout_dialog_investintent,
				null);

		final Dialog mDialog = new Dialog(this, R.style.my_login_dialog);
		menuView.measure(0, 0);

		mDialog.setContentView(menuView);

		mDialog.setCancelable(true);

		mDialog.setCanceledOnTouchOutside(true);

		dialog_title = (TextView) menuView.findViewById(R.id.dialog_title);
		send_text = (TextView) menuView.findViewById(R.id.send_text);
		cancel_text = (TextView) menuView.findViewById(R.id.cancel_text);

		cancel_text = (TextView) menuView.findViewById(R.id.cancel_text);

		// 处理 彩色文字
//		TextColorUtil mTextColorUtil = new TextColorUtil(this);
//
//		mTextColorUtil.fillText(dialog_title, "确认向", contents, "发送约谈？",
//				0xff333333, 0xFFF26522, 0xff333333);
//
//		send_text.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//
//				mDialog.cancel();
//			}
//		});

		cancel_text.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				mDialog.cancel();
			}
		});

		Window window = mDialog.getWindow();
		// window.setGravity(Gravity.TOP);//位置
		WindowManager.LayoutParams lp = window.getAttributes();
		WindowManager m = this.getWindowManager();
		Display d = m.getDefaultDisplay(); // 获取屏幕宽、高用

		lp.height = menuView.getMeasuredHeight();
		lp.width = menuView.getMeasuredWidth();

		window.setAttributes(lp);

		mDialog.show();

	}
    
    
    
    
}
