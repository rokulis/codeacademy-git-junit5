# Codeacademy 2023-09-01 GIT + JUnit5

## 1 užduotis

- Parsisiųskite (klonuokite) šią repozitoriją į savo kompiuterį
- Atidarykite projektą su Intellij IDE
- Peržiūrėkite pom.xml failą bei kitą kodą esantį programoje

## 2 užduotis
- Sukurkite naują šaką (branch) pavadinimu feature-customer-[jusuvardas]
- Įeikite į savo naują šaką ir ateinančias užduotis darykite joje.

## 3 užduotis: sukurkite Customer klasė
- Sukurkite Customer Klasę
- Sukurkite naują klasę pavadinimu Customer su laukais name ir email.
- Pridėkite atitinkamus getterius ir setterius šiems laukeliams.

## 4 užduotis: sukurkite savo išimtį (exception)
- Sukurkite checked išimtį, pavadinimu CustomerException.
- Naudokite šią išimtį patikrinti, ar name ir email laukai Customer klasėje nėra null ar tuščios eilutės - tai darykite konstruojant naują objektą (konstruktoriuje).

## 5 užduotis: github pull request
- GitHub sukurkite pull request'ą iš jūsų atšakos į main atšaką

## 6 užduotis: JUnit 5
- pridėkite į pom.xml junit 5 dependency (priklausomybė)
- Sukurkite JUnit testų klasę Product klasei.
- Parašykite testų atvejus, kurie patikrintų getName ir getPrice metodus.
---
- Sukurkite JUnit testų klasę Cart klasei.
- Parašykite testų atvejus, kurie patikrintų addProduct ir calculateTotal metodus, įskaitant testus išimtims.
---
- Sukurkite JUnit testų klasę Customer klasei.
- Parašykite testų atvejus, kurie patikrintų getName ir getEmail metodus, įskaitant testus jūsų pasirinktai išimčiai.
  

Kai baigsite visas užduotis, įsitikinkite, kad visi pakeitimai matosi jūsų pull request'ę github.com svetainėje.