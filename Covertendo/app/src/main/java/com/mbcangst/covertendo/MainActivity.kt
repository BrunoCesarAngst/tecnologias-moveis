package com.mbcangst.covertendo

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
//            if (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER || actionId == EditorInfo.IME_ACTION_DONE) {
//                //do what you want on the press of 'done'
//                submit.performClick()
//            }
//            false
//        })

        button.setOnClickListener(View.OnClickListener {
            var value = editText_value.text.toString();

            var dollar = editText_dollar.text.toString();

            if ( value.isNotEmpty() ) {
                textView_result_dollar.text = converted(value.toBigDecimal(), dollar.toBigDecimal()).toString();
            }
        });
    }

    private fun converted(value: BigDecimal, dollar: BigDecimal) :BigDecimal {
        return value.multiply(dollar);
    }
}
