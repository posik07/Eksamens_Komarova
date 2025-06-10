package Tests;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class OOPTest {
    private List<Question> jautajumi;
    private List<Integer> lietotajaAtbildes;

    public OOPTest() {
        jautajumi = new ArrayList<>();
        lietotajaAtbildes = new ArrayList<>();
        izveidotJautajumus();
    }

    private void izveidotJautajumus() {
        jautajumi.add(new Question(
            "Kas ir objekts Java programmēšanā?",
            new String[]{
                "Mainīgais, kas glabā datus",
                "Klases instance ar saviem datiem un metodēm", 
                "Funkcija, kas veic aprēķinus",
                "Faila nosaukums"
            },
            2 // pareizā atbilde - 2. opcija (1-bāzēta)
        ));

        jautajumi.add(new Question(
            "Kas ir klase Java valodā?",
            new String[]{
                "Objektu veidne jeb šablons",
                "Mainīgā tips",
                "Metodes nosaukums", 
                "Programmas daļa"
            },
            1
        ));

        jautajumi.add(new Question(
            "Kāds ir konstruktora mērķis Java klasē?",
            new String[]{
                "Iznīcināt objektu",
                "Mainīt objekta stāvokli",
                "Inicializēt objektu, kad tas tiek izveidots",
                "Pārbaudīt objekta derīgumu"
            },
            3
        ));

        jautajumi.add(new Question(
            "Kāda ir get metodes funkcija?",
            new String[]{
                "Iestatīt mainīgā vērtību",
                "Dzēst objektu",
                "Atgriezt privātā mainīgā vērtību",
                "Izveidot jaunu objektu"
            },
            3
        ));

        jautajumi.add(new Question(
            "Ko dara set metode?",
            new String[]{
                "Atgriež mainīgā vērtību",
                "Iestata vai maina privātā mainīgā vērtību",
                "Izdzēš mainīgo",
                "Pārbauda mainīgā tipu"
            },
            2
        ));

        jautajumi.add(new Question(
            "Kāpēc mainīgos parasti padara par private?",
            new String[]{
                "Lai tie būtu ātrāki",
                "Lai ietaupītu atmiņu",
                "Lai nodrošinātu enkapsulāciju un kontrolētu piekļuvi datiem",
                "Lai tie būtu redzami visās klasēs"
            },
            3
        ));

        jautajumi.add(new Question(
            "Vai konstruktoram var būt parametri?",
            new String[]{
                "Nē, nekad",
                "Jā, bet ne vairāk par 2",
                "Jā, var būt jebkurš parametru skaits",
                "Tikai tad, ja klase ir publiska"
            },
            3
        ));

        jautajumi.add(new Question(
            "Kad Java automātiski izveido noklusējuma konstruktoru?",
            new String[]{
                "Vienmēr",
                "Nekad",
                "Kad klasē nav definēts neviens konstruktors",
                "Kad klase ir abstrakta"
            },
            3
        ));

        jautajumi.add(new Question(
            "Vai klasē var būt vairākas get metodes ar dažādiem nosaukumiem?",
            new String[]{
                "Nē, tikai viena get metode",
                "Jā, katram mainīgajam var būt sava get metode",
                "Tikai publiskās klasēs",
                "Tikai ar speciālu atļauju"
            },
            2
        ));

        jautajumi.add(new Question(
            "Kā izveido jaunu objektu Java valodā?",
            new String[]{
                "Izmantojot new atslēgvārdu un konstruktoru",
                "Izmantojot create() metodi",
                "Automātiski programmas startā",
                "Izmantojot make komandu"
            },
            1
        ));
    }

    public void saktTestu() {
        JOptionPane.showMessageDialog(null, 
            "Laipni lūdzam OOP testā!\n" +
            "Jums būs 10 jautājumi par objektorientēto programmēšanu Java valodā.\n" +
            "Katram jautājumam ir 4 atbilžu varianti.\n" +
            "Izvēlieties pareizo atbildi (1-4)!");

        for (int i = 0; i < jautajumi.size(); i++) {
            Question jautajums = jautajumi.get(i);
            String[] opcijas = jautajums.getOpcijas();
            StringBuilder jautajumaTeksts = new StringBuilder((i + 1) + ". " + jautajums.getJautajums() + "\n\n");

            for (int j = 0; j < opcijas.length; j++) {
                jautajumaTeksts.append((j + 1)).append(". ").append(opcijas[j]).append("\n");
            }

            String atbilde = JOptionPane.showInputDialog(null, 
                jautajumaTeksts + "\nIevadiet atbildes numuru (1-4):");

            if (atbilde == null) {
                JOptionPane.showMessageDialog(null, "Tests tika pārtraukts.");
                return;
            }

            try {
                int atbildesNumurs = Integer.parseInt(atbilde.trim());
                if (atbildesNumurs >= 1 && atbildesNumurs <= 4) {
                    lietotajaAtbildes.add(atbildesNumurs);
                } else {
                    JOptionPane.showMessageDialog(null, "Nepareizs ievads! Tiks ierakstīts -1.");
                    lietotajaAtbildes.add(-1);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nepareizs ievads! Tiks ierakstīts -1.");
                lietotajaAtbildes.add(-1);
            }
        }

        raditRezultatus();
    }

    private void raditRezultatus() {
        int pareizasAtbildes = 0;
        StringBuilder rezultati = new StringBuilder();

        rezultati.append("TESTA REZULTĀTI\n");
        rezultati.append("================\n\n");

        for (int i = 0; i < jautajumi.size(); i++) {
            Question jautajums = jautajumi.get(i);
            int lietotajaAtbilde = lietotajaAtbildes.get(i);
            int pareizaAtbilde = jautajums.getPareizaAtbilde();

            rezultati.append((i + 1)).append(". ").append(jautajums.getJautajums()).append("\n");

            if (lietotajaAtbilde == -1) {
                rezultati.append("Jūsu atbilde: Nav atbildēts\n");
            } else {
                rezultati.append("Jūsu atbilde: ").append(lietotajaAtbilde)
                         .append(". ").append(jautajums.getOpcijas()[lietotajaAtbilde - 1]).append("\n");
            }

            if (lietotajaAtbilde == pareizaAtbilde) {
                rezultati.append("✓ PAREIZI!\n");
                pareizasAtbildes++;
            } else {
                rezultati.append("✗ NEPAREIZI!\n");
                rezultati.append("Pareizā atbilde: ").append(pareizaAtbilde)
                         .append(". ").append(jautajums.getOpcijas()[pareizaAtbilde - 1]).append("\n");
            }
            rezultati.append("\n");
        }

        rezultati.append("KOPSAVILKUMS:\n");
        rezultati.append("=============\n");
        rezultati.append("Pareizi atbildēti jautājumi: ").append(pareizasAtbildes)
                 .append(" no ").append(jautajumi.size()).append("\n");
        rezultati.append("Rezultāts: ").append((pareizasAtbildes * 100) / jautajumi.size())
                 .append("%\n");

        String[] rezultatuDalas = sadalitTekstu(rezultati.toString(), 1000);
        for (String dala : rezultatuDalas) {
            JOptionPane.showMessageDialog(null, dala, "Testa rezultāti", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private String[] sadalitTekstu(String teksts, int maksGarums) {
        List<String> dalas = new ArrayList<>();
        String[] rindas = teksts.split("\n");
        StringBuilder pasreizejaDala = new StringBuilder();

        for (String rinda : rindas) {
            if (pasreizejaDala.length() + rinda.length() + 1 > maksGarums) {
                if (pasreizejaDala.length() > 0) {
                    dalas.add(pasreizejaDala.toString());
                    pasreizejaDala = new StringBuilder();
                }
            }
            pasreizejaDala.append(rinda).append("\n");
        }

        if (pasreizejaDala.length() > 0) {
            dalas.add(pasreizejaDala.toString());
        }

        return dalas.toArray(new String[0]);
    }

    public static void main(String[] args) {
        OOPTest tests = new OOPTest();
        tests.saktTestu();
        System.exit(0);
    }
}
