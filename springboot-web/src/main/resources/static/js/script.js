document.addEventListener('DOMContentLoaded', function() {
    // Confirmación para eliminar usuario
    document.querySelectorAll('.delete-btn').forEach(button => {
        button.addEventListener('click', function(e) {
            if (!confirm('¿Estás seguro de querer eliminar este usuario?')) {
                e.preventDefault();
            }
        });
    });

    // Animación para tarjetas
    document.querySelectorAll('.user-card').forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-5px)';
        });

        card.addEventListener('mouseleave', function() {
            this.style.transform = 'translateY(0)';
        });
    });
});