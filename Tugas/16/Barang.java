package app.main;

import app.engine.Galat;
import app.engine.Operations;

public class Barang {
  private String nama, satuan;
  private int jumlah, harga;

	/* Konsep enkapsulasi getter & setter */
	public String getNama() {
		return nama;
	}

	public String getSatuan() {
		return satuan;
	}

	public int getJumlah() {
		return jumlah;
	}

	public int getHarga() {
		return harga;
	}

	public void setBarang(String nama, String satuan, int jumlah, int harga) {
		this.nama = nama;
		this.satuan = satuan;
		this.jumlah = jumlah;
		this.harga = harga;
	}
	
	/* Konsep enkapsulasi getter & setter */
}
