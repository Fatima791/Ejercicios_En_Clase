## Get de productos http://localhost:8080/productos/listar
Se utiliza para devolver la informacion
se consumio los siguientes datos
´´´
[
  {
    "id": 1,
    "nombre": "camisa",
    "precio": 15.99,
    "stock": 55
  },
  {
    "id": 2,
    "nombre": "Camisa Verde",
    "precio": 80.23,
    "stock": 12
  },
  {
    "id": 3,
    "nombre": "gorra roja",
    "precio": 5.0,
    "stock": 15
  },
  {
    "id": 4,
    "nombre": "camisola roja",
    "precio": 7.99,
    "stock": 10
  },
  {
    "id": 5,
    "nombre": "pans",
    "precio": 10.99,
    "stock": 15
  },
  {
    "id": 8,
    "nombre": "Zapatos",
    "precio": 80.23,
    "stock": 12
  },
  {
    "id": 9,
    "nombre": "Camisa Verde",
    "precio": 80.23,
    "stock": 12
  },
  {
    "id": 10,
    "nombre": "Zapatos",
    "precio": 80.23,
    "stock": 12
  }
]
´´´
se ve asi
![alt text](get.png)


## POST de productos http://localhost:8080/productos/listar
Se utiliza para agregar datos
se consumio los siguientes datos
´´´
{
  "nombre": "Zapatos",
  "precio": 80.23,
  "stock": 12
}
se ve asi
![alt text](POST-1.png)

## ACTUALIZAR http://localhost:8080/productos/guardar
Se utiliza para actualizar los datos
se consumio los siguientes datos
´´´
{
  "id": 2,
  "nombre": "Camisa Verde",
  "precio": 80.23,
  "stock": 12
}
´´´
se ve asi
![alt text](PUT-1.png)

## DELETE http://localhost:8080/productos/eliminar/7
Se utiliza para borrar los datos
se consumio los siguientes datos
Producto Eliminado Correctamente
se ve asi
![alt text](DELETE.png)

![alt text](<Como queda en la base de datos.png>)
