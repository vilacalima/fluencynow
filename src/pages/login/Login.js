import './Login.scss';

export default function Login(props){

    return(
        <div className='login'>
            <div className="login-insert">
                <p>Professor(a), Seja bem-vinda</p>
                <div className="login-label">
                    <p>Email</p>
                    <input></input>
                </div>
                <div className="login-label" >
                    <p>Senha</p>
                    <input></input>
                </div>
                <button>Faça seu Login</button>
            </div>
        </div>
    )
}