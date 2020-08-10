
$('document').ready(function(){
    $('.table #update-button').on('click', function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(state, status){
            $('#idEdit').val(state.id);
            $('#ddlCountryEdit').val(state.countryid);
            $('#nameEdit').val(state.name);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
        });
        $('#editModal').modal();
    });

    $('.table #details-button').on('click', function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(state, status){
            $('#idDetails').val(state.id);
            $('#ddlCountryDetails').val(state.countryid);
            $('#nameDetails').val(state.name);
            $('#lastModifiedByDetails').val(state.lastModifiedBy);
            $('#lastModifiedDateDetails').val(state.lastModifiedDate);
        });
        $('#editModal').modal();
    });



    $('.table #delete-button').on('click', function (event){
        event.preventDefault();
        let href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });
});

