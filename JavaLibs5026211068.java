import javax.swing.JOptionPane;
	
	public class JavaLibs5026211068 {
	public static void main(String[] Args) {
		String nama, gender, alamat, departemen, matakuliah1, matakuliah2, matakuliah3;
		int usia, jumlahsks1, jumlahsks2, jumlahsks3;
		double nilai1, nilai2, nilai3;	
	
	JOptionPane.showMessageDialog(null, "CEK IPS");
	JOptionPane.showMessageDialog(null, "Selamat datang di aplikasi pengecekan IPS mahasiswa!!!");	

	nama = JOptionPane.showInputDialog("Halo, nama kamu siapa? ");
	usia = Integer.parseInt(JOptionPane.showInputDialog("Berapa umur kamu? "));
	gender = JOptionPane.showInputDialog("Apa jenis kelamin kamu? ");
	alamat = JOptionPane.showInputDialog("Dimana kamu tinggal? "); 
	departemen = JOptionPane.showInputDialog( nama + " dari departemen apa? ");
	
	matakuliah1 = JOptionPane.showInputDialog("Mata Kuliah 1: ");
	jumlahsks1 = Integer.parseInt(JOptionPane.showInputDialog("Jumlah SKS " + matakuliah1 +":"));
	nilai1 = Double.parseDouble(JOptionPane.showInputDialog("Nilai " + matakuliah1 + ": " +"(misal : 1-4)"));
	
	matakuliah2 = JOptionPane.showInputDialog("Mata Kuliah 2: ");
	jumlahsks2 = Integer.parseInt(JOptionPane.showInputDialog("Jumlah SKS " + matakuliah2 + ":"));
	nilai2 = Double.parseDouble(JOptionPane.showInputDialog("Nilai " + matakuliah2 + ": "+"(misal : 1-4)"));
	
	matakuliah3 = JOptionPane.showInputDialog("Mata Kuliah 3: ");
	jumlahsks3 = Integer.parseInt(JOptionPane.showInputDialog("Jumlah SKS " + matakuliah3 + ":"));
	nilai3 = Double.parseDouble(JOptionPane.showInputDialog("Nilai " + matakuliah3 + ": "+"(misal : 1-4)"));

	int totalsks = jumlahsks1 + jumlahsks2 + jumlahsks3;
	double ips = (nilai1*jumlahsks1+nilai2*jumlahsks2+nilai3*jumlahsks3)/totalsks;

	JOptionPane.showMessageDialog(null, "Total SKS kamu: " + totalsks ); 
	JOptionPane.showMessageDialog(null, "IPS kamu adalah: " + ips );


	JOptionPane.showMessageDialog(null, "Terima kasih atas responnya " + nama + "!!!");
		
       }
}
