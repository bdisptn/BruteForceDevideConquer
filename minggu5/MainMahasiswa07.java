package minggu5;

public class MainMahasiswa07 {
    public static void main(String[] args) {

        Mahasiswa07[] data = {
            new Mahasiswa07("Ahmad","220101001",2022,78,82),
            new Mahasiswa07("Budi","220101002",2022,85,88),
            new Mahasiswa07("Cindy","220101003",2021,90,87),
            new Mahasiswa07("Dian","220101004",2021,76,79),
            new Mahasiswa07("Eko","220101005",2023,92,95),
            new Mahasiswa07("Fajar","220101006",2020,88,85),
            new Mahasiswa07("Gina","220101007",2023,80,83),
            new Mahasiswa07("Hadi","220101008",2020,82,84)
        };

        int maxUTS = Mahasiswa07.maxUTS(data, 0, data.length - 1);
        int minUTS = Mahasiswa07.minUTS(data, 0, data.length - 1);
        double rataUAS = Mahasiswa07.rataUAS(data);

        System.out.println("Nilai UTS Tertinggi : " + maxUTS);
        System.out.println("Nilai UTS Terendah  : " + minUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
    
}
