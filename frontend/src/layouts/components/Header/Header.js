import { useState } from 'react';
import { NavLink } from 'react-router-dom';

function Header() {
    const user = {
        id: 1,
        name: 'Nguyen Van A',
        email: 'van@gmail.com',
        password: '123',
    };
    const [showEl, setShowEl] = useState(false);
    return (
       <h1>header</h1>
    );
}

export default Header;
