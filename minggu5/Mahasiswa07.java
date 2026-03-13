package minggu5;

public class Mahasiswa07 {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    Mahasiswa07(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    static int maxUTS(Mahasiswa07 arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int leftMax = maxUTS(arr, l, mid);
        int rightMax = maxUTS(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }

    static int minUTS(Mahasiswa07 arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int leftMin = minUTS(arr, l, mid);
        int rightMin = minUTS(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    static double rataUAS(Mahasiswa07 arr[]) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }

        return total / arr.length;
    }
}
