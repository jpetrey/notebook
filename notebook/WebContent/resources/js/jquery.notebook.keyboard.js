(function($)
{
    if(!$.notebook)
    {
        $.notebook = new Object();
    };
    
    $.notebook.Keyboard = function(el, options)
    {
        // To avoid scope issues, use 'base' instead of 'this'
        // to reference this class from internal events and functions.
        var base = this;
        
        // Access to jQuery and DOM versions of element
        base.$el = $(el);
        base.el = el;
        
        // Add a reverse reference to the DOM object
        base.$el.data("notebook.Keyboard", base);
        
        base.init = function()
        {
        	
        	// Extend the options object
            base.options = $.extend({},$.notebook.Keyboard.defaultOptions, options);
            
            // Bind the context menu event.
            base.$el.contextmenu( function(e) 
            { 
            	e.preventDefault();
            	// Make keyboard visible, etc.
            	base.makeKeyboardVisible();
            });
            
        };
        
        base.makeKeyboardVisible = function() 
        {
        	// TODO put stuff here
        	
        };
        
        // Run initializer
        base.init();
    };
    
    $.notebook.Keyboard.defaultOptions = 
    {
        
    };
    
    $.fn.notebook_Keyboard = function(options)
    {
        return this.each(function()
        {
            (new $.notebook.Keyboard(this, options));
        });
    };
    
})(jQuery);
