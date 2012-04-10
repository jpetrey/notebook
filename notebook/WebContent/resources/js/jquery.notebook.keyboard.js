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
        	// Extend the options with the defaults if necessary.
            base.options = $.extend({},$.notebook.Keyboard.defaultOptions, options);
            
            // Build the keyboard and make it invisible.
            base.keyboard = $('[id='+base.options.keyboardElement+']');
            
            base.autocomplete = $('[id="'+base.options.clientId+':'+base.options.autocompleteValueElement+'"]');
            
            base.keyboard.css( {
            	'width' : base.options.diameter,
            	'height' : base.options.diameter,
            	'position' : 'absolute'
            });
            
            var canvas = Raphael(base.keyboard.attr('id'), base.options.diameter, base.options.diameter);
            angle = 0;
            var color = Raphael.color(base.options.color);
            while (angle < 360) 
            {
		            (function (t, c) {
		            	charRadius = ((3.14*base.options.diameter)/base.options.numOptions)/2.5;
		            	// Draw the character for this circle.
		            	px = (0.5*base.options.diameter) + ( (0.45*base.options.diameter) * Math.cos( angle * (Math.PI/180) ) );
		            	py = (0.5*base.options.diameter) + ( (0.45*base.options.diameter) * Math.sin( angle * (Math.PI/180) ) );
		            	
		            	character = base.options.characterSet[Math.ceil((angle/(360/base.options.numOptions)))];
		            	
		            	x = 0.19*base.options.diameter;
		            	y = 0.19*base.options.diameter;
		            	text = canvas.text(px, py, character);
		            	text.transform("s1.5");
		            	
		            	// Draw the circle and attach event handlers to it.
		                canvas.circle(x, y, charRadius).attr({stroke: c, fill: c, transform: t, "fill-opacity": .4})
		                .mouseover(function () {
		                    this.animate({"fill-opacity": .75}, 200);
		                }).mouseout(function () {
		                    this.animate({"fill-opacity": .4}, 200);
		                }).click(function(){
		                	console.log( this.character );
		                	// Append the character to the autocomplete word and hidden value.
		                	base.autocomplete.val(base.autocomplete.val()+this.character);
		                	base.autoText.remove();
		                	base.autoText = canvas.text(base.options.diameter/2, base.options.diameter/2, base.autocomplete.val());
		                	base.autoText.transform("s2");
		                }).character = character;
	            })("r" + angle + " " + 0.5*base.options.diameter +", "+0.5*base.options.diameter, color);
	            angle += (360/base.options.numOptions);
	        }
            
            console.log(base.autocomplete.val());
            base.autoText = canvas.text(base.options.diameter/2, base.options.diameter/2, base.autocomplete.val());
            base.autoText.transform("s2");
            
            // Hide the keyboard
            base.keyboard.hide();
            
            // Bind the context menu event.
            base.$el.contextmenu( function(e) 
            { 
            	e.preventDefault();
            	// Make keyboard visible, etc.
            	base.activateKeyboard(e);
            });
            
            base.keyboard.mouseleave(function(){
            	base.keyboard.hide();
            });
        };
        
        base.activateKeyboard = function(e) 
        {
        	// Position the keyboard appropriately and make it visible.
        	base.keyboard.css('top', e.pageY-base.options.diameter/2);
        	base.keyboard.css('left', e.pageX-base.options.diameter/2);
        	base.keyboard.show();
        };
        
        // Run initializer
        base.init();
    };
    
    $.notebook.Keyboard.defaultOptions = 
    {
    	clientId : '',
    	keyboardElement : 'keyboard',
    	autocompleteValueElement : 'autocomplete',
        diameter : '200',
        color : 'cornflowerblue',
        numOptions : '4',
        characterSet : [ 'a','b','c','d' ]
    };
    
    $.fn.notebook_Keyboard = function(options)
    {
        return this.each(function()
        {
            (new $.notebook.Keyboard(this, options));
        });
    };
    
})(jQuery);
