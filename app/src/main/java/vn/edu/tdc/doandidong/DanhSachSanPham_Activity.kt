package vn.edu.tdc.doandidong

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DanhSachSanPham_Activity : AppCompatActivity() {
    private lateinit var imgb_back : ImageButton
    private lateinit var tvDanhSachSP: TextView
    private lateinit var linearLayout1: LinearLayout
    private lateinit var linearLayout2: LinearLayout
    private lateinit var linearLayout3: LinearLayout
    private lateinit var linearLayout4: LinearLayout
    private lateinit var linearLayout5: LinearLayout
    private lateinit var linearLayout6: LinearLayout
    private lateinit var linearLayout7: LinearLayout
    private lateinit var linearLayout8: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danh_sach_san_pham)
        setControl()
        setEvent()
    }

    private fun setControl() {
        tvDanhSachSP = findViewById(R.id.tvDanhSachSP)
        imgb_back = findViewById(R.id.imgb_back)

        linearLayout1 = findViewById(R.id.linearLayout1)
        linearLayout2 = findViewById(R.id.linearLayout2)
        linearLayout3 = findViewById(R.id.linearLayout3)
        linearLayout4 = findViewById(R.id.linearLayout4)
        linearLayout5 = findViewById(R.id.linearLayout5)
        linearLayout6 = findViewById(R.id.linearLayout6)
        linearLayout7 = findViewById(R.id.linearLayout7)
        linearLayout8 = findViewById(R.id.linearLayout8)
    }

    private fun setEvent() {
        imgb_back.setOnClickListener{
            finish()
        }

        // Gán sự kiện click cho từng sản phẩm
        linearLayout1.setOnClickListener {

            moChiTietSanPham("Capuchino", "2$", "Capuchino là một loại cà phê Ý được làm từ espresso, sữa nóng và bọt sữa.", R.drawable.caphe)
        }


    }

    private fun moChiTietSanPham(tenSanPham: String, giaSanPham: String, moTaSanPham: String, hinhAnh: Int) {
        val intent = Intent(this, ChiTietSanPham_Activity::class.java)
        intent.putExtra("tenSanPham", tenSanPham)
        intent.putExtra("giaSanPham", giaSanPham)
        intent.putExtra("moTaSanPham", moTaSanPham)
        intent.putExtra("hinhAnh", hinhAnh)
        startActivity(intent) // Chuyển sang màn hình chi tiết sản phẩm
    }
}
