package com.github.karol8650.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


  /*
  pokazuej Springowi, że to jest repozytorium z odpowiednimi metodami
  tworzymy nie tylko repozytorium, ale cały interfejs restowy.
  Ten interface służy do komunikacji z bazą danych (API do działania na danych)
  <Task, Integer>: Task -> określa z jakiej encji brać defenicje bazodanowe; Integer -> typ klucza
  Jpa - do baz relacyjnych
  */
@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Integer> {
    /*
    JpaRepository rozszerza kilka interfejsów, które zawierają wiele metod (m.in. crudowe metody).
    Spring Data na podstawie nazwy metody (np. findAll) potrafi stworzyć odpowiednie zapytanie do bazy
    (np. findAll() (przy bazie relacyjnej) = SELECT * from tabela)
     */
}
