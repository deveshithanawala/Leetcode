/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let initialValue = init;
    return{
       increment: function() {
            return ++init;
        },
        reset: function() {
            init = initialValue;
            return init;
        },
        decrement: function() {
            return --init;
        },
    }
    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */