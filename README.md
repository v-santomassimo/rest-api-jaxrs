# REST API JAXRS - Cenni Teorici e bootstrap di un progetto


## Cenni sull’approccio REST

>L’approccio _**REST  (“Representational state transfer”)**_ è un insieme di principi architettonici (stile architetturale) incentrati sulle esigenze di ottimizzazione di servizi web e applicazioni mobile. Trattandosi esclusivamente di linee guida o raccomandazioni, la loro implementazione è lasciata agli sviluppatori.
>
In genere, una richiesta di dati inviata a un'API REST avviene tramite il protocollo HTTP. Una volta ricevuta la richiesta, le API progettate per REST (chiamate API o servizi web RESTful) possono restituire i messaggi in numerosi formati: HTML, XML, testo semplice e JSON. JSON (JavaScript Object Notation) è il formato di messaggistica più adottato, perché, a dispetto del nome, può essere letto da qualsiasi linguaggio di programmazione, dagli utenti e dalle macchine, ed è ottimizzato. In questo modo le API RESTful sono più flessibili e configurabili con facilità.

Un'applicazione viene definita RESTful se rispetta sei principi architetturali, disponendo di:

1. Un'_**architettura client-server**_ costituita da client, server e risorse. Con questa separazione dei ruoli, il client non si preoccupa del salvataggio delle informazioni, che rimangono all’interno dei server; a loro volta, i server non si fa carico dell’interfaccia grafica o dello stato dell’utente. In questo modo la portabilità del codice ne trae vantaggio;
2. Una _**comunicazione client server stateless**_, in cui nessun contenuto client viene archiviato sul server tra le richieste. Le informazioni relative allo stato della sessione si trovano inoltre sul client;
3. _**Caching dei dati (salvare la response nella cache del browser)**_, per eliminare la necessità di alcune interazioni client server.;
4. Un'_**interfaccia uniforme per i componenti**_, in modo che le informazioni vengano trasferite in una forma standard e non specifica alle esigenze di un'applicazione. Roy Fielding, creatore di REST, la definisce come "la caratteristica di base che distingue lo stile architettonico REST da altri stili basati sulla rete".
5. Un sistema di vincoli a più livelli, in cui le interazioni client server possono essere mediate da livelli gerarchici (**“Layered system”**).
6. _**Codice on demand**_, per consentire ai server di estendere la funzionalità di un client trasferendo il codice eseguibile. Poiché ciò riduce anche la visibilità, questa raccomandazione è facoltativa.

Un concetto importante in REST è l’esistenza delle _**“risorse”**_ (fonti di informazioni) a cui si può accedere tramite un identificatore globale (cioè un _**URI**_).
Per utilizzare le risorse, i componenti di una rete (client e server) comunicano attraverso il protocollo HTTP per scambiare delle rappresentazioni di queste risorse, cioè il formato dell’informazione restituita (es. una risorsa “cerchio” potrebbe accettare di restituire una rappresentazione di quella risorsa in formato SVG oppure CSV).
I metodi HTTP tipicamente usati sono:
* **GET**: recupera un elenco di risorse oppure una rappresentazione di un elemento specifico, identificato con un id. Questo metodo è detto “safe method” o nullipotente, perchè la sua invocazione non produce nessun effetto collaterale;
* **PUT**: sostituisce un insieme di risorse oppure un elemento specifico; se non esiste, lo crea;
* **POST**: crea un nuovo elemento;
* **DELETE**: elimina un elemento o una intera collezione.

I metodi PUT e DELETE sono invece “idempotenti”, perché lo stato del sistema rimane invariato indipendentemente dal numero di volte che la richiesta viene ripetuta.


## Cenni su JAX-RS

>_**Jakarta RESTful Web Services (JAX-RS)**_ è una specifica (insieme di regole che quel sistema deve avere) dell’API Jakarta EE che fornisce supporto nella creazione di servizi Web secondo il modello architettonico REST. JAX-RS utilizza le annotazioni, introdotte in Java SE 5, per semplificare lo sviluppo e la distribuzione di client ed endpoint di servizi web.

JAX-RS fornisce alcune annotazioni per aiutare a mappare una classe di risorse (POJO - Plain Old Java Object) come risorsa web. Le annotazioni utilizzano il pacchetto javax.ws.rs e le principali includono:
* __*@Path*__: specifica il percorso relativo per una classe di risorse o un metodo;
* __*@GET, @PUT, @POST,@DELETE*__ specificano il tipo di richiesta HTTP;
* __*@Produces*__ specifica i tipi di media Internet di risposta;
* __*@Consumes*__ specifica i tipi di media Internet della richiesta accettata.

Le implementazioni (cioè la realizzazione delle linee guida settate dalle specifiche) di JAX-RS includono Jersey (che ho usato in questo progetto), RestEasy e altre.


## Bootstrap del progetto

Maven, Tomcat 10, Eclipse IDE, Java 8/11

1. Aprire Eclipse. Creare un nuovo progetto Maven:
<p align="center">
  <img src="https://user-images.githubusercontent.com/80511726/129180024-bf382f00-f4f3-4a7a-a570-d37e0cf4d0f6.png" width="350" alt="accessibility text">
</p>
2. Cliccare su “Next”:
<p align="center">
  <img src="https://user-images.githubusercontent.com/80511726/129180521-ccc722eb-8340-4cc2-a908-3e15f5b0ad9d.png" width="350" alt="accessibility text">
</p>
3.  Selezionare l’archetipo __*“jersey-quickstart-webapp”*__ per generare il template del progetto con le dipendenze base di Jersey. Cliccare poi su “Next”:
<p align="center">
  <img src="https://user-images.githubusercontent.com/80511726/129180636-e676948a-7460-476a-ae45-45cf1561c648.png" width="350" alt="accessibility text">
</p>
4. Infine, compilare groupId e artifactid  e cliccare su “Fine”:
<p align="center">
  <img src="https://user-images.githubusercontent.com/80511726/129180683-bc218bd8-7b71-4900-81d2-a034a6c9e29d.png" width="350" alt="accessibility text">
</p>







