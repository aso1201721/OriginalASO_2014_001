package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		// ボタンをIDで探してボタン変数をつくる
		Button btnOK = (Button)findViewById(R.id.btnOk);
		// ボタン変数にリスナーを登録する
		btnOK.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		//TODO　自動生成されたメソッド・スタブ
			switch(v.getId()){
				case R.id.btnOk:

			// Randomクラスのインスタンスをつくる
			Random rnd = new Random();
			// 0～3の4パターンの数字をranに取得
			int ran = rnd.nextInt(4);

			//生成して代入用のIntentインスタンス変数を用意
			Intent intent = null;
			// ranの値によって処理をわける
			switch(ran){
				case 0:
					// 0なら大吉のページへ飛ばす
					// インテントのインスタンス生成
					intent = new Intent(MainActivity.this,  daikiti.class);
					// 次画面のアクティビティ
					startActivity(intent);
					break;
				case 1:
					// 0なら大吉のページへ飛ばす
					// インテントのインスタンス生成
					intent = new Intent(MainActivity.this,  tyukiti.class);
					// 次画面のアクティビティ
					startActivity(intent);
					break;
				case 2:
					// 0なら大吉のページへ飛ばす
					// インテントのインスタンス生成
					intent = new Intent(MainActivity.this,  kyo.class);
					// 次画面のアクティビティ
					startActivity(intent);
					break;
				case 3:
					// 0なら大吉のページへ飛ばす
					// インテントのインスタンス生成
					intent = new Intent(MainActivity.this,  daikyo.class);
					// 次画面のアクティビティ
					startActivity(intent);
					break;
			}
	}

}
}
