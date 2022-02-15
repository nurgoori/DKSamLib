package co.kr.dksamplelib.utils

import android.content.Context
import android.widget.Toast

class ToastManager {

    companion object {
        private var toast: Toast? = null

        fun showToast(context: Context, str: String?) {

            if (toast == null) {
                toast = Toast.makeText(context, str, Toast.LENGTH_SHORT)
            } else {
                try {
                    toast!!.cancel()
                    toast = Toast.makeText(context, str, Toast.LENGTH_SHORT)
                } catch (e: Exception) {
                    // e.printStackTrace();
                }
            }
            toast!!.show()
        }
    }


}