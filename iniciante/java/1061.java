import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		String inicio = in.nextLine();
		String entInicio [] = inicio.split(" ");
		String horaInicio = in.nextLine();
		String entHoraInicio [] = horaInicio.split(" ");
		String fim = in.nextLine();
		String entFim [] = fim.split(" ");
		String horaFim = in.nextLine();
		String entHoraFim [] = horaFim.split(" ");

		int diaInicial = Integer.parseInt(entInicio[1]);
		int horaInicial = Integer.parseInt(entHoraInicio[0]);
		int minInicial = Integer.parseInt(entHoraInicio[2]);
		int segInicial = Integer.parseInt(entHoraInicio[4]);

		int diaFinal = Integer.parseInt(entFim[1]);
		int horaFinal = Integer.parseInt(entHoraFim[0]);
		int minFinal = Integer.parseInt(entHoraFim[2]);
		int segFinal = Integer.parseInt(entHoraFim[4]);

		int totalFinal = segFinal + (minFinal * 60) + (horaFinal * 60 * 60) + (diaFinal * 24 * 60 * 60);
		int totalInicial = segInicial + (minInicial * 60) + (horaInicial * 60 * 60) + (diaInicial * 24 * 60 * 60);

		int total = totalFinal - totalInicial;
		int dia, hora, min, seg;

		dia = total/(24*60*60);
		total = total%(24*60*60);

		hora = total/3600;
		total = total%3600;

		min = total/60;
		seg = total%60;

		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(min + " minuto(s)");
		System.out.println(seg + " segundo(s)");
	}

}