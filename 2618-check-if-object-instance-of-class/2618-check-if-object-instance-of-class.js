/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {

    if (obj === null || obj === undefined) {
        return false;
    }

    if (typeof classFunction !== "function") {
        return false;
    }

    // Convert primitives to wrapper objects
    return Object(obj) instanceof classFunction;
};