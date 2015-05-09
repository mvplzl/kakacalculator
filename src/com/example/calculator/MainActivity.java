package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	String temp = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView tv = (TextView) findViewById(R.id.textview);
		ImageButton btnclear = (ImageButton) findViewById(R.id.clear);
		ImageButton btnaddminus = (ImageButton) findViewById(R.id.addminus);
		ImageButton btndiv = (ImageButton) findViewById(R.id.div);
		ImageButton btnmul = (ImageButton) findViewById(R.id.mul);
		ImageButton btnminus = (ImageButton) findViewById(R.id.minus);
		ImageButton btnadd = (ImageButton) findViewById(R.id.add);
		ImageButton btnamount = (ImageButton) findViewById(R.id.amount);
		ImageButton btnpoint = (ImageButton) findViewById(R.id.point);
		ImageButton btnnum1 = (ImageButton) findViewById(R.id.num1);
		ImageButton btnnum2 = (ImageButton) findViewById(R.id.num2);
		ImageButton btnnum3 = (ImageButton) findViewById(R.id.num3);
		ImageButton btnnum4 = (ImageButton) findViewById(R.id.num4);
		ImageButton btnnum5 = (ImageButton) findViewById(R.id.num5);
		ImageButton btnnum6 = (ImageButton) findViewById(R.id.num6);
		ImageButton btnnum7 = (ImageButton) findViewById(R.id.num7);
		ImageButton btnnum8 = (ImageButton) findViewById(R.id.num8);
		ImageButton btnnum9 = (ImageButton) findViewById(R.id.num9);
		ImageButton btnnum0 = (ImageButton) findViewById(R.id.num0);

		tv.setText(temp);
		btnnum1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 1;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 2;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 3;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 4;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 5;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 6;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 7;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 8;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 9;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnnum0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += 0;
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnclear.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp = "";
				tv.setText(temp);
			}
		});
		btnadd.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += "+";
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnminus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += "-";
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnmul.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += "×";
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btndiv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				temp += "÷";
				tv.setText(temp);
				if (temp.length() >= 9) {
					tv.setTextSize(30);
				}
				if (temp.length() < 9) {
					tv.setTextSize(50);
				}
			}
		});
		btnamount.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				boolean flag = true;// 默认纯数字为true
				int fuhao = 0;// 1加，2减，3乘，4除
				char[] array = tv.getText().toString().toCharArray();
				for (int i = 0; i < array.length; i++) {
					if (array[i] == '+' || array[i] == '-' || array[i] == '×'
							|| array[i] == '÷') {
						flag = false;
					}
				}
				if (flag) {
					tv.setText(temp);
				} else {
					for (int j = 0; j < array.length; j++) {
						switch (array[j]) {
						case '+':
							fuhao = 1;
							break;
						case '-':
							fuhao = 2;
							break;
						case '×':
							fuhao = 3;
							break;
						case '÷':
							fuhao = 4;
							break;

						}
					}
				}
				String head = "";
				String end = "";
				double a = 0;
				double b = 0;
				double c = 0;
				switch (fuhao) {
				case 1:
					head = temp.split("[+]")[0];
					end = temp.split("[+]")[1];
					a = Double.parseDouble(head);
					b = Double.parseDouble(end);
					c = a + b;
					temp = ""+c;
					tv.setText(temp);
					break;
				case 2:
					head = temp.split("-")[0];
					end = temp.split("-")[1];
					a = Double.parseDouble(head);
					b = Double.parseDouble(end);
					c = a - b;
					temp = ""+c;
					tv.setText(temp);
					break;
				case 3:
					head = temp.split("×")[0];
					end = temp.split("×")[1];
					a = Double.parseDouble(head);
					b = Double.parseDouble(end);
					c = a * b;
					temp = ""+c;
					tv.setText(temp);
					break;
				case 4:
					head = temp.split("÷")[0];
					end = temp.split("÷")[1];
					a = Double.parseDouble(head);
					b = Double.parseDouble(end);
					c = a / b;
					temp = ""+c;
					tv.setText(temp);
					break;

				}
			}
		});
	}

}
