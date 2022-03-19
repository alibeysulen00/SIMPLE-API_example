# API (GET)
Java ile API sorgusu 
https://collectapi.com/ sitesinden üye girişi yapıldıktan sonra tüm api lerin apikey'ine erişilebiliyor
bu sayede istediğimiz api sorgusunu hatasız bir şekilde gerçekleştirebiliriz


Kütüphanenin Maven kullanarak projeye dahil etmek için pom.xml dosyası içerisinde 
<dependencies></dependencies> etiketleri arasına aşağıdaki satırlar eklenmelidir.

<dependency>
 <groupId>com.konghq</groupId>
 <artifactId>unirest-java</artifactId>
 <version>3.12.0</version>
 </dependency>
 
 böylelikle kütüphaneyi eklemiş oluyoruz yukarda verilen sitede URI adresini ve APIKEY i aldıktan sonra
 istediğimiz sorguyu gerçekleştirebiliriz
