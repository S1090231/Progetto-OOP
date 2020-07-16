# Progetto Facebook - OOP

Il progetto che abbiamo realizzato ha la finalità di analizzare le foto pubblicate nel diario dell'utente Facebook "Meraviglie Italiane". Tale analisi è stata possibile grazie all'uso delle API fornite dal sito [Facebook for Developers](https://dillinger.io/developers.facebook.com). Per poter effettuare l'accesso a tali servizi è stato necessario generare un Access Token(di tempo limitato) e, allo stesso tempo, conoscere l'id dell'album.

URL per ritorno dati:

    "https://graph.facebook.com/v7.0/" +Album_id+ "/photos?fields=height%2Cwidth%2Cname&access_token=" +Acces_token

La nostra applicazione è stata realizzata grazie all'IDE Eclipse, in concomitanza del software Git, il quale ci ha permesso di lavorare in gruppo, ognuno su diversi aspetti del progetto. Tramite l’utilizzo della Web Application Spring Boot è stato possibile "mandare in ascolto" il nostro programma alla porta 8080 cosi da effettuare delle richieste GET e POST, tramite la rotta: http://localhost:8080.
Naturalmente il nostro codice, per essere implementato, sfrutta il software di API development: Postman, che gestisce le richieste possibili restituendo, ad ognuna di esse, delle risposte(JSON, ArrayString...). 

## Funzionamento dell'applicazione
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Use%20Case%20Diagramm/UseCaseDiagram.jpg?raw=true">


## Richieste

Le richieste da eseguire, tramite l'API testing Postman alla rotta http://localhost:8080 sono:
|TIPO | ROTTA | DESCRIZIONE|
|-----| ------ | ------ |
| GET| /metadata |Restituisce i metadati
| GET |/data | Restituisce l'elenco dei dati per ogni foto
| GET |/type_stats| Restituisce la tipologia di immagini(orizzontali, verticali, quadrate)
| GET |/caption_stats | Restituisce il numero di parole presenti nella caption di ogni foto
|POST |/filtered_data | Restituisce i dati filtrati in base alla caption e/o al tipo di immagine 

## Filtri
Qui di seguito vengono riportati i filtri disponibili con relativi esempi: 
| OPERATORE CONDIZIONALE| ESEMPIO | DESCRIZIONE |
| ----------------------| ---------------- | ---- |
|Greater | {"Width":{"**Greater**":700}} | Prende le foto con un certo campo maggiore del valore dato |
|Less |{"Height":{"**Less**":500}} | Prende le foto con un certo campo minore del valore dato |
| Between |{"Height":{"**Between**":[600,700]}}|Prende le foto con un certo campo compreso tra i valori dati
| Yes | {"Caption":{"**Yes**":[]}}| Prende le foto che hanno la didascalia
| No |{"Caption":{"**No**":[]}}|Prende le foto che non hanno la didascalia


Per i nostri filtri sono disponibili tali operatori logici:

| OPERATORE LOGICO| ESEMPIO | DESCRIZIONE |
| ----------------------| ---------------- | ---- |
|And | {"Width":{"Less":500},"Caption":{"Type":"**and**","Yes":[]}} | Prende le foto che rispettano più filtri insieme |
|Or |{"Height":{"Greater":700},"Caption":{"Type":"**or**","No":[]}} | Prende le foto che rispettano almeno uno dei filtri |

> Risposta dei due esempi precedenti
* AND
``` json 
[  
  {  
	"name": "L'Etna o Mongibello è un vulcano della Sicilia originatosi nel Quaternario ed è il più alto vulcano attivo terrestre della placca euroasiatica",  
	"photo_id": "114899120294032",  
	"height": 674,  
	"width": 450  
  },  
  {  
	"name": "La reggia di Caserta è un palazzo reale, con annesso un parco, ubicato a Caserta. È la residenza reale più grande al mondo per volume e i proprietari storici sono stati i Borbone di Napoli, oltre a un breve periodo in cui fu abitata dai Murat.",  
	"photo_id": "114445020339442",  
	"height": 512,  
	"width": 384  
  },  
  {  
	"name": "La Torre di Pisa è un campanile a sé stante alto 57 metri costruito nell'arco di due secoli, tra il dodicesimo e il quattordicesimo secolo. L'inclinazione dell'edificio misura 3,9° rispetto all'asse verticale.",  
	"photo_id": "101595061624438",  
	"height": 277,  
	"width": 182  
  }  
]  
```
* OR
``` json  
[  
  {  
	"name": "Piazza San Marco, situata a Venezia, è una delle più importanti piazze monumentali italiane, rinomata in tutto il mondo per la sua bellezza e integrità architettonica.",  
	"photo_id": "108059520977992",  
	"height": 720,  
	"width": 720  
  },  
  {  
	"name": null,  
	"photo_id": "114436337006977",  
	"height": 600,  
	"width": 600  
  },  
  {  
	"name": null,  
	"photo_id": "114135097037101",  
	"height": 720,  
	"width": 480  
  }  
]  
```




## UML
### Diagrammi delle Classi
* it.project.facebook.**controller**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Controller.png?raw=true" width=300>
* it.project.facebook.**database**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Database.png?raw=true" width=300>
* it.project.facebook.**exception**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Exception.png?raw=true" width=400>
* it.project.facebook.**model**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Model.png?raw=true" width=400>
* it.project.facebook.**service**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Service.png?raw=true" width=400>
* it.project.facebook.utils.**filters**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Filters.png?raw=true" width=400>
* it.project.facebook.utils.**stats**
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Class%20Diagramm/Stats.png?raw=true" width=300>

## Diagrammi delle sequenze
* **GET**/ data
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Sequence%20Diagramm/GET_Data%20.png?raw=true" width=500>
* **GET**/ metadata
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Sequence%20Diagramm/GET_Metadata.png?raw=true" width=500>

* **GET**/ caption_stats
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Sequence%20Diagramm/GET_caption_stats.png?raw=true" width=500>
* **GET**/ type_stats
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Sequence%20Diagramm/GET_type_stats.png?raw=true" width=500>
* **POST**/ filtered_data
<img src="https://github.com/S1090144/ProjectOOP/blob/master/Diagrammi%20UML/Sequence%20Diagramm/POST_filtered_data.png?raw=true" width=500>

### Esempi di chiamate

> GET/metadata

```json  
[
  {  
    "alias": "photo_id",  
    "sourceField": "id della foto",  
    "type": "String"  
  },  
  {  
    "alias": "width",  
    "sourceField": "larghezza della foto",  
    "type": "Long"  
  },  
  {  
	"alias": "name",  
	"sourceField": "caption della foto",  
	"type": "String"  
  },  
  {  
	"alias": "height",  
	"sourceField": "altezza della foto",  
	"type": "Long"  
  }
]
```

> GET/data (risposta parziale per ragioni di spazio)
```json  
[  
  {  
	"name": "L'Etna o Mongibello è un vulcano della 	Sicilia originatosi ne Quaternario ed è il più alto vulcano attivo terrestre della placca euroasiatica",  
	"photo_id": "114899120294032",  
	"height": 674,  
	"width": 450  
  },  
  {  
	"name": "Le Cinque Terre sono un frastagliato tratto di costa della Riviera ligure di levante nel quale si trovano cinque borghi o, come si diceva anticamente, terre: Monterosso al Mare, Vernazza, Corniglia, Manarola e Riomaggiore.",  
	"photo_id": "108817134235564",  
	"height": 342,  
	"width": 720  
  },  
  {  
	"name": "Piazza San Marco, situata a Venezia, è una delle più importanti piazze monumentali italiane, rinomata in tutto il mondo per la sua bellezza e integrità architettonica.",  
	"photo_id": "108059520977992",  
	"height": 720,  
	"width": 720  
  },  
  {  
	"name": "La Torre di Pisa è un campanile a sé stante alto 57 metri costruito nell'arco di due secoli, tra il dodicesimo e il quattordicesimo secolo. L'inclinazione dell'edificio misura 3,9° rispetto all'asse verticale.",  
	"photo_id": "101595061624438",  
	"height": 277,  
	"width": 182  
  }  
]  
```
> GET/ type_stats
```
Le foto quadrate sono 2, quelle orizzontali 5 e quelle verticali 4
```
> GET/caption_stats
```  
[  
	"Parole nella caption della 1° foto: 21",  
	"Parole nella caption della 2° foto: 45",  
	"Parole nella caption della 3° foto: 0",  
	"Parole nella caption della 4° foto: 0",  
	"Parole nella caption della 5° foto: 43",  
	"Parole nella caption della 6° foto: 35",  
	"Parole nella caption della 7° foto: 26",  
	"Parole nella caption della 8° foto: 41",  
	"Parole nella caption della 9° foto: 29",  
	"Parole nella caption della 10° foto: 37",  
	"Parole nella caption della 11° foto: 16"  
]  
```
> POST/filtered_data

Body:  {"Height": { "Greater":600 }}
```  json
[  
  {  
	"name": "L'Etna o Mongibello è un vulcano della Sicilia originatosi nel Quaternario ed è il più alto vulcano attivo terrestre della placca euroasiatica",  
	"photo_id": "114899120294032",  
	"height": 674,  
	"width": 450  
  },  
  {  
	"name": null,  
	"photo_id": "114135097037101",  
	"height": 720,  
	"width": 480  
  },  
  {  
	"name": "Piazza San Marco, situata a Venezia, è una delle più importanti piazze monumentali italiane, rinomata in tutto il mondo per la sua bellezza e integrità architettonica.",  
	"photo_id": "108059520977992",  
	"height": 720,  
	"width": 720  
  }  
]  
```
## Software utilizzati
* [Eclipse](https://www.eclipse.org/)- Ambiente di sviluppo integrato
* [Maven](https://maven.apache.org/)- Strumento di gestione di progetti software
* [Spring Initializr](https://start.spring.io/)- Framework con le dipendenze necessarie per poter compilare ed eseguire il codice
* [UML Designer](http://www.umldesigner.org/)- E' uno strumento UML open source che abbiamo utilizzato per la realizzazione del diagramma dei casi d'uso e delle sequenze
* [ObjectAid](https://www.objectaid.com/home)- Plugin di Eclipse che noi abbiamo utilizzato per realizzare i diagrammi delle classi 

## Autori
Il progetto è stato eseguito in completa collaborazione, tuttavia nello specifico, alcune parti sono state realizzate singolarmente come segue:    
* Mattia Scuriatti: controller, statistiche e servizi
* Giada Gatti: filtri, eccezioni, Readme, diagrammi UML 
