package grails.gorm.tests

import grails.persistence.Entity

/**
 * Test entity for testing AWS SimpleDB.
 *
 * @author Roman Stepanenko
 * @since 0.1
 */

@Entity
class PetType implements Serializable {
    String id
    Long version

    String name

    static belongsTo = Pet
}