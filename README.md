Proiectul reprezinta un backend pentru o aplicatie ce faciliteaza tranzactii cu o baza de date ce contine date referitoare la filme si actori.

Backend-ul proiectului este spart in mai multe pachete: repository, controller, model si services.
Ca si date se prelucreaza filme si actori, actorii contin un id si o varsta, iar filmele id, director si gen.

In faza curenta proiectul contine functionalitatea necesara pentru a permite operatiile crud pe baza de data si pentru a putea face request-uri si raspunde la request-uri (post,put,get). Ca si ulterioara dezvoltare se va introduce un camp de casting la tipul de data movie care va fi o lista de foreign key-uri la tabela actor.