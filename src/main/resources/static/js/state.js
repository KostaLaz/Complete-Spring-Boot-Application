
$('document').ready(function(){
    $('table #update-button').on('click', function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(state, status){
            $('#idEdit').val(state.id);
            $('#descriptionEdit').val(state.name);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
        });
        $('#editModal').modal();
    });

    $('table #delete-button').on('click', function (event){
        event.preventDefault();
        let href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });
});

