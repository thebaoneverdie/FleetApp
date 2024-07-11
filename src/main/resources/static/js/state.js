//
//$('document').ready(function(){
//    $('table #editButton').on('click', function(event){
//        event.preventDefault();
//
//        var href = $(this).attr('href');
//
//        $.get(href, function(state, status){
//            $('#idEdit').val(state.id)
//            $('#ddlCountryEdit').val(state.countryid);
//            $('#capitalEdit').val(state.capital);
//             $('#codeEdit').val(state.code);
//            $('#nameEdit').val(state.name);
//            $('#detailsEdit').val(state.details);
//        });
//        $('#editModal').modal();
//    });
//
//    $('.table #detailsButton').on('click', function(event){
//    event.preventDefault();
//    var href = $(this).attr('href');
//    $.get(href, function(state, status){
//        $('#idDetails').vak(state.id);
//        $('#ddlCountryDetails').val(state.countryid);
//        $('#capitalEdit').val(state.capital);
//        $('#nameDetails').val(state.name);
//        $('#lastModifiedByDetails').val(state.lastModifiedBy);
//        $('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));
//    });
//
//
//    $('table #deleteButton').on('click', function(event){
//     event.preventDefault();
//
//     var href = $(this).attr('href');
//
//     $('#confirmDeleteButton').attr('href', href);
//
//     $('#deleteModal').modal();
//      });
//});
//
//
//
//
$(document).ready(function(){
    $('.table .btn-primary').on('click', function(event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function(state, status){
            $('#idEdit').val(state.id);
            $('#ddlCountryEdit').val(state.countryid);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
            $('#nameEdit').val(state.name);
            $('#detailsEdit').val(state.details);
        });

        $('#editModal').modal();
    });

});
$(document).ready(function(){
    $('.table .btn-success').on('click', function(event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function(state, status){
            $('#idDetails').val(state.id);
            $('#ddlCountryDetails').val(state.countryid);
            $('#capitalDetails').val(state.capital);
            $('#nameDetails').val(state.name);
            $('#lastModifiedByDetails').val(state.lastModifiedBy);
            $('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0, 19).replace("T", " "));
        });

        $('#detailsModal').modal();
    });

    $('table #deleteButton').on('click', function(event){
         event.preventDefault();

         var href = $(this).attr('href');

         $('#confirmDeleteButton').attr('href', href);

         $('#deleteModal').modal();
    });
});


