package com.apress.cems.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Iuliana Cosmina
 * @since 1.0
 */
@Component
public interface Human {

    Item getItem();
}
