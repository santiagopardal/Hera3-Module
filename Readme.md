# NYTimesData 馃摪
NYTimesData  es una librer铆a que obtiene informaci贸n de un artista a trav茅s del API del diario New York Times, la informaci贸n buscada contiene:
- 馃憠 Informaci贸n del artista
- 馃憠 URL del art铆culo donde se encontr贸 esta informaci贸n
- 馃憠 La URL de la im谩gen del logo del diario "The New York Times"

# Instalaci贸n 馃
1. Incluir la librer铆a en la carpeta libs.
2. Incluir la librer铆a en settings.gradle de la siguiente manera:
```
include ':NYTimesData'
project(':NYTimesData').projectDir = new File(rootDir, 'libs/NYTimesData/NYTimesData/')
```
3. Incluir la librer铆a en build.gradle:
```
implementation project(':NYTimesData')
```
4. Deber铆a de mostrarse una opci贸n para sincronizar el proyecto ("Sync Now"), seleccionarla.
5. Listo! 鉁?

# Uso 馃檶
1. Obtener el servicio mediante su m贸dulo 馃げ :
```
val nyTimesArticleService = NYTimesModule.nyTimesArticleService
```
2. Se puede obtener art铆culos a trav茅s de la funci贸n `getArticle(artistName)` de NYTimesArticleService
```
val article = nyTimesArticleService.getArticle("Drake")
```
El art铆culo va a contener toda la informaci贸n mencionada anteriormente y estar谩 disponible para utilizarla.


## Casos a tener en cuenta 鉁嶏笍
1. En caso de no tener conexi贸n a internet o no encontrar informaci贸n del artista, se retornar谩 un art铆culo vacio (EmptyArticle 馃し鈥嶁檪锔? ).