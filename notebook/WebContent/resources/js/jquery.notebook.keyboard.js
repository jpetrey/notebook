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
            
            // Create the keyboard and make it invisible.
            
            // Bind the context menu event.
            base.$el.contextmenu( function(e) 
            { 
            	e.preventDefault();
            	// Make keyboard visible, etc.
            	base.activateKeyboard();
            });
            
            
            //---
            
            var r = Raphael("holder", 640, 480),
            angle = 0;
        while (angle < 360) {
            var color = Raphael.getColor();
            (function (t, c) {
                r.circle(320, 450, 20).attr({stroke: c, fill: c, transform: t, "fill-opacity": .4}).click(function () {
                    s.animate({transform: t, stroke: c}, 2000, "bounce");
                }).mouseover(function () {
                    this.animate({"fill-opacity": .75}, 500);
                }).mouseout(function () {
                    this.animate({"fill-opacity": .4}, 500);
                });
            })("r" + angle + " 320 240", color);
            angle += 30;
        }
        Raphael.getColor.reset();
        var s = r.set();
        s.push(r.path("M320,240c-50,100,50,110,0,190").attr({fill: "none", "stroke-width": 2}));
        s.push(r.circle(320, 450, 20).attr({fill: "none", "stroke-width": 2}));
        s.push(r.circle(320, 240, 5).attr({fill: "none", "stroke-width": 10}));
        s.attr({stroke: Raphael.getColor()});
            
            //---
        };
        
        base.activateKeyboard = function() 
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
