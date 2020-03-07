package io.ddd.stereotype.applicationcore;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Represents the ID of an aggregate. Note that each @Aggregate needs exactly one @AggregateID
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface AggregateId
{

}
