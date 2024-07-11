
$('document').ready(function(){
    $('.table .btn-primary').on('click', function(event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function(state, status){
            $('#idEdit').val(state.id)
            $('#ddlCountryEdit').val(state.description);
            $('#nameEdit').val(state.name);
            $('#detailsEdit').val(state.details);
        });
        $('#editModal').modal();
    });

    $('table #deleteButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');

     $('#confirmDeleteButton').attr('href', href);

     $('#deleteModal').modal();
      });
});




