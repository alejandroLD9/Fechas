package dominio;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasHoras {
    public static void main(String[] args) {

        LocalDate fechaActualLocal = LocalDate.now();
        System.out.println("Fecha actual local: " + fechaActualLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        ZonedDateTime fechaCaracas = ZonedDateTime.now(ZoneId.of("America/Caracas"));
        System.out.println("Fecha actual en Caracas: " + fechaCaracas.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate descubrimientoAmerica = LocalDate.of(1492, Month.OCTOBER, 12);
        long añosTranscurridos = ChronoUnit.YEARS.between(descubrimientoAmerica, fechaActualLocal);
        System.out.println("Años transcurridos desde el descubrimiento de América: " + añosTranscurridos);

        LocalTime horaActualLocal = LocalTime.now();
        System.out.println("Hora actual local: " + horaActualLocal.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalTime horaCaracas = LocalTime.now(ZoneId.of("America/Caracas"));
        System.out.println("Hora actual en Caracas: " + horaCaracas.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        ZonedDateTime horaMadrid = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        long diferenciaHoras = ChronoUnit.HOURS.between(horaCaracas, horaMadrid);
        System.out.println("Horas de diferencia entre Madrid y Caracas: " + diferenciaHoras);

        LocalDateTime fechaHoraLuna = LocalDateTime.of(1969, Month.JULY, 21, 3, 56);
        System.out.println("Neil Armstrong pisó la luna el: " + fechaHoraLuna.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }
}
