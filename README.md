# Java OOP: Elektroniskais Tests, macību matērials kā word dokumentā, koda piemēri

Šis projekts ir elektroniskais tests par objektorientētās programmēšanas (OOP) jēdzieniem Java valodā. Tests ir izveidots ar JOptionPane grafisko saskarni un satur 10 jautājumus par OOP pamatjēdzieniem.

## Projekta struktūra

- **OOPTest.java** - Galvenā testa klase ar JOptionPane saskarni
- **Question.java** - Klase viena jautājuma reprezentācijai
- **Piemers1.java** - Piemērs par klašu un objektu pamutiem
- **Piemers2.java** - Piemērs par pārmantošanu
- **Piemers3.java** - Piemērs par abstrakciju un polimorfisms izmantošanu

## Kā palaist testu

1. Kompilējiet visus Java failus:
   ```
   javac src/*.java
   ```

2. Palaidiet galveno testa klasi:
   ```
   java -cp src OOPTests
   ```

## Testa saturs
Sākumā testu mūs sagaida logs, kas apraksta programmu. Cik daudz jautājumu, atbildes varianti un kā pareizi nokārtot testu.

![Снимок экрана 2025-06-11 030721](https://github.com/user-attachments/assets/e3e93a65-587e-4bd9-8dcc-d597cd8aa921)

Tests ietver 10 jautājumus par:
- Klašu un objektu jēdzieniem
- Konstruktoru mērķi un izmantošanu
- Get un Set metožu funktionalitāti
- Enkapsulācijas principiem
- Objektu izveides sintaksi
- Metožu izsaukšanas veidu

## Testa funkcionalitāte

- Interaktīva saskarne ar JOptionPane
- 10 jautājumi ar 4 atbilžu variantiem katram
- Automātiska rezultātu aprēķināšana
- Detalizēti rezultāti ar pareizajām atbildēm
- Procentuālais vērtējums

Pēc tam, kad esam pieņēmuši nosacījumus un nospieduši OK pogu, sākas pats tests. Mūs sagaida jautājums un atbildes varianti. Ievades rindā ir jāievada tikai atbildes varianta skaits.

![Снимок экрана 2025-06-11 030743](https://github.com/user-attachments/assets/549dda72-918c-4da3-bad0-a11bbd8b323d)

Atbilde uz jautājumu neliksies uzreiz, tikai tad, kad viss tests būs nokārtots, izdarīti visi 10 jautājumi. Kad būsim izpildījuši testu, tests atzīmēs kur nepareizas un pareizas variantu atbildes. Ja lietotājs uz jautājumu atbildējis nepareizi, rezultāti parādīs pareizo atbildes variantu. Pašā apakšā programma aprēķinās jūsu vērtējumu, vadoties pēc izpildītā testa.

![Снимок экрана 2025-06-11 030840](https://github.com/user-attachments/assets/c218cbe2-2675-4b5c-9348-5219636f6e32)

![Снимок экрана 2025-06-11 030851](https://github.com/user-attachments/assets/d1b8e382-cf5c-499c-9fba-c47099f1eda5)


## Piemēru faili

Papildus testam ir iekļauti 3 piemēru faili, kas demonstrē:

1. **Klases un objekti** - Automašīnas klases piemērs
2. **Pārmantošana** - Dzīvnieku klase ar dažādiem konstruktoriem un metodiem
3. **Polimorfisms un abstrakcija** - Dažadas formas klase ar abstrakciju

Šie piemēri palīdz labāk saprast OOP jēdzienus praktiskā kontekstā.

### 1. Klases un objekti
Šajā Java programmā tiek veidots piemērs par automašīnu. Kods demonstrē, kā darbojas klases un objekti programmēšanā. Tiek izveidota klase ar nosaukumu Automasina, kurā ir saglabāta informācija par marku, modeli, gadu un ātrumu. Ar konstruktora palīdzību tiek izveidoti divi automašīnas objekti: BMW un Audi.

Lietotājam tiek prasīts ievadīt, cik ātri automašīnas paātrinās un pēc tam – cik tās bremzē. Programma aprēķina jauno ātrumu un parāda gala rezultātus. Šis piemērs palīdz saprast, kā tiek izmantoti objekti un kādēļ ir svarīgi sadalīt datus un funkcijas klasēs.

![Снимок экрана 2025-06-11 023427](https://github.com/user-attachments/assets/58f6ec2a-2295-4e8b-b085-3055a4b7f837)

Šī Java programma demonstrē objektorientētās programmēšanas pamatelementus: klasi, konstruktoru, objektus, privātos laukus, metodes un enkapsulāciju. Tiek izveidota klase Automasina, kas modelē reālu automašīnu ar informāciju par marku, modeli, ražošanas gadu un ātrumu.

Katra automašīna var paātrināties un bremzēt. Programma ļauj lietotājam ievadīt vēlamās darbības, izmantojot Scanner klasi. Visas darbības tiek izvadītas konsolē, kas palīdz sekot līdzi objekta stāvokļa izmaiņām. Šis kods ir labs piemērs OOP (Object-Oriented Programming) principu pielietošanai praksē.

![Снимок экрана 2025-06-11 023458](https://github.com/user-attachments/assets/cfd95c59-3dcd-4027-aa41-9fa6439e03f2)

Programma ilustrē klasiskos objektorientētās programmēšanas principus Java valodā. Tiek definēta iekšējā statiskā klase Automasina ar četriem privātiem laukiem un publiskām metodēm to manipulācijai (getter, paātrinājums, bremzēšana). Tiek izmantots konstruktors, lai inicializētu objektus ar sākotnējiem datiem, nodrošinot enkapsulāciju.

Galvenā main metode darbojas kā interaktīva konsoles lietotne, kas ļauj lietotājam ievadīt paātrinājuma un bremzēšanas vērtības. Metodes paatrinatAt un bremzet manipulē ar objekta stāvokli atbilstoši ievadei. Kodam ir strukturēta loģika un labs piemērs, kā apvienot OOP ar lietotāja ievades apstrādi.

![Снимок экрана 2025-06-11 023530](https://github.com/user-attachments/assets/7b58f0ae-698a-41b2-a1e4-82c804eef7f4)

Šajā projektā izstrādāts vienkāršs Java simulators, kas attēlo divas automašīnas – BMW un Audi. Tiek izmantota klase Automasina, kurai ir savs konstruktors un vairākas metodes darbībām ar objekta datiem. Lietotājs var interaktīvi norādīt, cik lielu paātrinājumu vai bremzēšanu veikt katrai automašīnai.

Projekts parāda, kā programmēšanas valodā Java var modelēt reālus objektus un izmantot klases, lai strukturētu kodu saprotami un efektīvi. Tas ir labs pamats, lai tālāk attīstītu simulācijas spēles vai datu modeļus.

![Снимок экрана 2025-06-11 023549](https://github.com/user-attachments/assets/e4300470-d717-4851-a4f5-0d505a2be537)

Šī programma simulē divu automašīnu (BMW un Audi) kustību, izmantojot klasi Automasina, kas satur datus par marku, modeli, gadu un ātrumu. Lietotājs ievada paātrinājuma un bremzēšanas vērtības, kuras tiek apstrādātas ar metodēm, un programma atjauno automašīnas stāvokli. Tā parāda OOP pamatus – objektus, metodes, privātos laukus un enkapsulāciju.


### 2. Pārmantošana
Šajā Java piemērā tiek demonstrēts mantošanas princips programmēšanā. Ir izveidota pamatklase Dzivnieks, kurā saglabāti vispārīgi dzīvnieka dati: vārds un vecums, kā arī darbības, ko dzīvnieks var darīt – ēst un gulēt.

No šīs pamatklases manto divas citas klases – Suns un Kakis. Katrai no tām ir savas īpašās metodes: Suns var riet, bet Kakis maukā. Abas apakšklases pārraksta metodi paraditInfo(), lai informācija būtu specifiska attiecīgajam dzīvniekam. Turklāt kaķis arī pārraksta ēšanas metodi – viņš ēd zivi.

Programmas galvenajā daļā tiek izveidoti trīs objekti: viens vispārīgs dzīvnieks, viens suns un viens kaķis. Katram tiek izsauktas dažādas metodes, parādot, kā darbojas mantošana un metode pārrakstīšana (override) Java valodā.

![Снимок экрана 2025-06-11 024336](https://github.com/user-attachments/assets/9dde352b-fff6-4eba-98b0-7b367fbfd368)

![Снимок экрана 2025-06-11 024358](https://github.com/user-attachments/assets/0105c7ca-6d83-4638-a271-e46d48147947)

Kods Piemers2 ilustrē klases mantošanu Java valodā. Bāzes klase Dzivnieks satur vispārīgas īpašības (vārds, vecums) un metodes (est, gulet, paraditInfo). Divas apakšklases – Suns un Kakis – manto šīs īpašības, papildinot tās ar specifisku funkcionalitāti: Suns var riet, Kakis maukā un ēd zivi.

Katra apakšklase pārraksta (override) metodi paraditInfo(), pielāgojot tās uzvedību. Konstruktoros tiek izmantots super(), lai nodrošinātu bāzes klases lauku inicializāciju.

Programmas main metodē tiek instancēti trīs dažādi objekti, un tiek demonstrēta polimorfisma un mantošanas darbība praksē. Šis ir labs piemērs OOP pamatprincipiem: mantošanai, enkapsulācijai un metožu pārrakstīšanai.

![Снимок экрана 2025-06-11 024411](https://github.com/user-attachments/assets/5685c50c-dcff-4037-8703-9f795209d6ff)

![Снимок экрана 2025-06-11 024422](https://github.com/user-attachments/assets/4f0c733b-9e64-422b-89b3-d371be4b9720)


### 3. Polimorfisms un abstrakcija
Šis piemērs parāda, kā darbojas abstraktas klases un polimorfisms Java valodā. Ir izveidota abstrakta klase Forma, kurā ir vispārīgas īpašības – piemēram, formas krāsa – un divas abstraktas metodes: viena, lai aprēķinātu laukumu, otra – perimetru.

![Снимок экрана 2025-06-11 025032](https://github.com/user-attachments/assets/dfdf5468-1485-4cca-a56f-fee7db0117ac)

No šīs klases manto trīs konkrētas formas: aplis, taisnstūris un trīsstūris. Katra no tām savā veidā aprēķina laukumu un perimetru, tādējādi demonstrējot polimorfismu – kad viena un tā pati metode darbojas atšķirīgi dažādās klasēs.

![Снимок экрана 2025-06-11 025051](https://github.com/user-attachments/assets/e9c77fa3-b777-4a69-bd95-24b6f8352632)

Programmas beigās ar ciklu tiek izsaukta metode paraditInfo() katrai formai, parādot laukumu, perimetru un formu nosaukumus. Tas ir labs piemērs tam, kā dažādas formas var izmantot vienādu struktūru, bet uzvesties dažādi.

![Снимок экрана 2025-06-11 025108](https://github.com/user-attachments/assets/5d8127d6-c212-4d81-8fa8-2af7ec3d851a)

Piemers3 Java klasē tiek demonstrēti OOP pamatprincipi – abstrakcija un polimorfisms. Tiek definēta abstrakta bāzes klase Forma ar divām abstraktām metodēm: aprekinatLauk() un aprekinatP() – tās jārealizē visām apakšklasēm.

![Снимок экрана 2025-06-11 025131](https://github.com/user-attachments/assets/d221a790-a13f-4fce-880f-3d810819cd9b)

Apakšklases Aplis, Taisnsturis un Trīsstūris implementē šīs metodes atbilstoši saviem ģeometriskajiem likumiem. Izmantojot masīvu Forma[], tiek parādīts polimorfisms, kur viena metode (paraditInfo()) darbojas ar dažādām klasēm, kas manto no vienas bāzes.

![Снимок экрана 2025-06-11 025147](https://github.com/user-attachments/assets/2f46855e-0dc3-409c-aeb6-fc62e999f4e0)

Turklāt tiek izmantots instanceof, lai noteiktu konkrēto formas tipu un piekļūtu tās unikālajām metodēm. Tādējādi šis piemērs lieliski ilustrē, kā veidot fleksiblu, paplašināmu kodu, izmantojot abstraktas klases un OOP principus.

![Снимок экрана 2025-06-11 025210](https://github.com/user-attachments/assets/a0fa2c4b-e847-4eed-822a-12c0f3a01875)

## Macību matērials
Tāpat es sniedzu mācību materiālu ar avotiem no interneta pilnībā pašas uzrakstītu.Tas sastāv no detalizēta apraksta, kas tas ir, kurā izmanto šo tēmu programmēšanā, tās trūkumus un uzņēmību, kā arī bildes un piemērus ar kodu.

## Avoti
Šeit norādītie visi izmantotie informācijas avoti no interneta:
- https://blog.skillfactory.ru/glossary/oop-obektno-orientirovannoe-programmirovanie/
- https://sky.pro/wiki/javascript/uchebnye-materialy-po-obuektno-orientirovannomu-programmirovaniyu/
- https://ru.wikipedia.org/wiki/%D0%9E%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BD%D0%BE-%D0%BE%D1%80%D0%B8%D0%B5%D0%BD%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5
- https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
- https://www.techtarget.com/searchapparchitecture/definition/object-oriented-programming-OOP
- https://en.wikipedia.org/wiki/Object-oriented_programming

Paldies par darbu!
