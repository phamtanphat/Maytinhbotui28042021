package com.example.maytinhbotui28042021;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    EditText mEdtSoThu1,mEdtSoThu2;
    TextView mTvKetQua;
    Button mBtnCong,mBtnTru,mBtnNhan,mBtnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // chuẩn style code google

        // Ánh xạ
        mEdtSoThu1 = findViewById(R.id.ediTextSoThu1);
        mEdtSoThu2 = findViewById(R.id.ediTextSoThu2);
        mTvKetQua = findViewById(R.id.textViewKetQua);
        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        mBtnChia = findViewById(R.id.buttonChia);

        //nút cộng
        // lấy giá trị từ 2 edittext
        // thực hiện việc cộng 2 giá trị
        // in giá trị cho textview để hiển thị

        // Task
        // Thứ 1 : Xử lý cho các phép toán còn lại
        // Thứ 2 : Nếu chia cho 0 thì thông báo không chia được
        // Thứ 3 : Nếu người dùng không nhập giá trị thì thông báo
        // Sự kiện click
        // ctrl + p : xem kiểu dữ liệu
        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ edittext;
                String textSoThu1 = mEdtSoThu1.getText().toString();
                String textSoThu2 = mEdtSoThu2.getText().toString();

                // validate

                if (textSoThu1.equals("") || textSoThu2.equals("")){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                int valueSoThu1 = Integer.parseInt(textSoThu1);
                int valueSoThu2 = Integer.parseInt(textSoThu2);


                int ketQua = valueSoThu1 + valueSoThu2;

                mTvKetQua.setText("Kết quả = " + ketQua);
            }
        });
        mBtnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ edittext;
                String textSoThu1 = mEdtSoThu1.getText().toString();
                String textSoThu2 = mEdtSoThu2.getText().toString();

                // validate

                if (textSoThu1.equals("") || textSoThu2.equals("")){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                double valueSoThu1 = Double.parseDouble(textSoThu1);
                double valueSoThu2 = Double.parseDouble(textSoThu2);

                if (valueSoThu2 == 0){
                    Toast.makeText(MainActivity.this, "Không chia cho giá trị 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                double ketQua = valueSoThu1 / valueSoThu2;

                mTvKetQua.setText("Kết quả = " + ketQua);
            }
        });
        mBtnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ edittext;
                String textSoThu1 = mEdtSoThu1.getText().toString();
                String textSoThu2 = mEdtSoThu2.getText().toString();

                // validate

                if (textSoThu1.equals("") || textSoThu2.equals("")){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                int valueSoThu1 = Integer.parseInt(textSoThu1);
                int valueSoThu2 = Integer.parseInt(textSoThu2);

                DecimalFormat decimalFormat = new DecimalFormat("#,###");

                int ketQua = valueSoThu1 * valueSoThu2;

                mTvKetQua.setText("Kết quả = " + decimalFormat.format(ketQua).replace(",","."));
            }
        });
        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ edittext;
                String textSoThu1 = mEdtSoThu1.getText().toString();
                String textSoThu2 = mEdtSoThu2.getText().toString();

                // validate

                if (textSoThu1.equals("") || textSoThu2.equals("")){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                int valueSoThu1 = Integer.parseInt(textSoThu1);
                int valueSoThu2 = Integer.parseInt(textSoThu2);


                int ketQua = valueSoThu1 - valueSoThu2;

                mTvKetQua.setText("Kết quả = " + ketQua);
            }
        });
    }
}