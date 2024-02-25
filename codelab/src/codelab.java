import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String gender = scanner.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);

        System.out.printf("Nama %s%n", name);
        System.out.printf("Jenis Kelamin %s%n", gender.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan");
        System.out.printf("Umur Anda %d tahun %d bulan%n", period.getYears(), period.getMonths());

        scanner.close();
    }
}