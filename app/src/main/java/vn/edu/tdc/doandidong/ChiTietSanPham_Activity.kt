package vn.edu.tdc.doandidong

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChiTietSanPham_Activity : AppCompatActivity() {
    private lateinit var imgb_Back : ImageView
    private lateinit var imgPic : ImageView
    private lateinit var tvminusCart: TextView
    private lateinit var tvplusCart: TextView
    private lateinit var tvSoLuong: TextView
    private lateinit var tvTenSP: TextView
    private lateinit var tvGiaSP: TextView
    private lateinit var tvMotaSP: TextView
    private lateinit var btn_AddCart: Button

    private var Soluong = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chi_tiet_san_pham)
        setControl()
        setEvent()

        // Nhận dữ liệu từ Intent
        val TenSP = intent.getStringExtra("tenSanPham")
        val GiaSP = intent.getStringExtra("giaSanPham")
        val MotaSP = intent.getStringExtra("moTaSanPham")
        val hinhAnh = intent.getIntExtra("hinhAnh", R.drawable.caphe)

        // Hiển thị dữ liệu lên UI
        tvTenSP.text = TenSP
        tvGiaSP.text = GiaSP
        tvMotaSP.text = MotaSP
        imgPic.setImageResource(hinhAnh)
        tvSoLuong.text = Soluong.toString()
    }

    private fun setControl() {
        imgb_Back = findViewById(R.id.imgb_Back)
        imgPic = findViewById(R.id.imgPic)
        tvminusCart = findViewById(R.id.minusCart)
        tvplusCart = findViewById(R.id.plusCart)
        tvSoLuong = findViewById(R.id.tvSoLuong)
        tvTenSP = findViewById(R.id.tvTenSP)
        tvGiaSP = findViewById(R.id.tvGiaSP)
        tvMotaSP = findViewById(R.id.tvMotaSP)
        btn_AddCart = findViewById(R.id.btn_AddCart)
    }

    private fun setEvent() {

        tvplusCart.setOnClickListener {
            Soluong++
            tvSoLuong.text = Soluong.toString()
        }

        tvminusCart.setOnClickListener {
            if (Soluong > 1) {
                Soluong--
                tvSoLuong.text = Soluong.toString()
            }
        }

        btn_AddCart.setOnClickListener {
            Toast.makeText(this, "Đã thêm vào giỏ hàng", Toast.LENGTH_SHORT).show()
        }
        imgb_Back.setOnClickListener{
            val intent = Intent(this , DanhSachSanPham_Activity::class.java)
            startActivity(intent)
        }
    }
}
