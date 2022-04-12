package ie2a_2200511.sakuhin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main_tv = findViewById<TextView>(R.id.main_tv)        //画面のテキストヴュー
        val change_btn = findViewById<Button>(R.id.change_btn)    //画面のボタン

        //ボタンクリックイベントリスナー設定
        change_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, IntentTestActivity::class.java)
            //Intentオブジェクトにテキストの内容をプットする
            nextIntent.putExtra("main_tv", main_tv.text.toString())
            //次のActivity実行
            startActivity(nextIntent)
        }
    }
}