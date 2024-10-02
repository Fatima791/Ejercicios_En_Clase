package intecap.caja.common;

import org.springframework.beans.factory.annotation.Autowired;

public class commoncontroller <E, S extends commonsvc<E>> {

    @Autowired
    protected S service;


}