(function($){
    if(!$.notebook){
        $.notebook = new Object();
    };
    
    $.notebook.Noteboard = function(el, options){
        // To avoid scope issues, use 'base' instead of 'this'
        // to reference this class from internal events and functions.
        var base = this;
        
        // Access to jQuery and DOM versions of element
        base.$el = $(el);
        base.el = el;
        
        // Add a reverse reference to the DOM object
        base.$el.data("notebook.Noteboard", base);
        
        base.init = function(){
        	
        	// Extend the options object
            base.options = $.extend({},$.notebook.Noteboard.defaultOptions, options);
            
            // Draw the notes
            for( var i = 0; i < base.options.notes.length; i++ )
            {
            	var note = base.options.notes[i];
            	console.log( note.title + ' (' + note.comments + ') - ' + note.color );
            	
            	for( var j = 0; j < note.categories.length; j++ )
            	{
            		var category = note.categories[j];
            		console.log( '   ' + category.title + ' (' + category.comments + ')' );
            	}
            	
            	// Draw each note
            	var noteDiv = $(document.createElement('div'));
            	noteDiv.addClass('note');
            	var noteHeader = $(document.createElement('div'));
            	noteHeader.addClass('noteHeader');
            	noteHeader.text(note.title);
            	var noteBody = $(document.createElement('div'));
            	noteBody.addClass('noteBody');
            	noteBody.text('Note body');
            	var noteComments = $(document.createElement('div'));
            	noteComments.addClass('noteComments');
            	noteComments.text(note.comments);
            	
            	noteDiv.append(noteHeader);
            	noteDiv.append(noteBody);
            	noteDiv.append(noteComments);
            	
            	base.$el.append( noteDiv );
           	}
            
            var p = $(document.createElement('p'));
            p.css('clear','both');
            base.$el.append(p);
            
            base.$el.sortable(
            		{
            			containment : base.$el
            		});
            
        };
        
        // Sample Function, Uncomment to use
        // base.functionName = function(paramaters){
        // 
        // };
        
        // Run initializer
        base.init();
    };
    
    $.notebook.Noteboard.defaultOptions = {
        notes: null
    };
    
    $.fn.notebook_Noteboard = function(options){
        return this.each(function(){
            (new $.notebook.Noteboard(this, options));
        });
    };
    
})(jQuery);
