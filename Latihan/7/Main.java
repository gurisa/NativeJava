public class Main {
	public static void main(String[] args) {
		MahasiswaKongkrit mhsk = new MahasiswaKongkrit();
		Mahasiswa<MahasiswaKongkrit> mhsg = new Mahasiswa<MahasiswaKongkrit>();
		
		mhsk.setNama("Raka Suryaardi Widjaja\n");
		mhsg.setNama(mhsk);
		
		System.out.print(mhsk.getNama());
		System.out.print(mhsg.getNama().getNama());
	}
}