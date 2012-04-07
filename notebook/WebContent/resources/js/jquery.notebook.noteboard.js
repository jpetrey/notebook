(function($){
    if(!$.notebook){
        $.notebook = new Object();
    };
    
    $.notebook.Noteboard = function(el, notes, options){
        // To avoid scope issues, use 'base' instead of 'this'
        // to reference this class from internal events and functions.
        var base = this;
        
        // Access to jQuery and DOM versions of element
        base.$el = $(el);
        base.el = el;
        
        // Add a reverse reference to the DOM object
        base.$el.data("notebook.Noteboard", base);
        
        base.init = function(){
            base.notes = notes;
            
            base.options = $.extend({},$.notebook.Noteboard.defaultOptions, options);
            
            // Put your initialization code here
            console.log('Noteboard jQuery plugin initializing!');
            base.$el.css('background-color','#FF0000');
        };
        
        // Sample Function, Uncomment to use
        // base.functionName = function(paramaters){
        // 
        // };
        
        // Run initializer
        base.init();
    };
    
    $.notebook.Noteboard.defaultOptions = {
        notes: "null"
    };
    
    $.fn.notebook_Noteboard = function(notes, options){
        return this.each(function(){
            (new $.notebook.Noteboard(this, notes, options));
        });
    };
    
})(jQuery);
